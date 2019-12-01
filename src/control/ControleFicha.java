/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Aluno;
import model.Ficha;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author bianca
 */
public class ControleFicha extends Controle<Ficha> {

    public ControleFicha() {
        super(Ficha.class);
    }

    public Ficha findByAlunoLast(Aluno al) {
        EntityManager em = getEntityManager();
        TypedQuery<Ficha> consulta = em.createNamedQuery("Ficha.findByAlunoLast", Ficha.class);
        consulta.setParameter("aluno", al);
        consulta.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return consulta.getSingleResult();
    }

    public List<Ficha> findByAlunoPeriodo(Aluno al, Date data1, Date data2) {
        EntityManager em = getEntityManager();
        TypedQuery<Ficha> consulta = em.createNamedQuery("Ficha.findByAlunoPeriodo", Ficha.class);
        consulta.setParameter("aluno", al);
        consulta.setParameter("data1", data1);
        consulta.setParameter("data2", data2);

        return consulta.getResultList();
    }

}
