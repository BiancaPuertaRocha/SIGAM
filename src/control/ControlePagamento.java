/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Aluno;
import model.Pagamento;
import util.Conversoes;


public class ControlePagamento extends Controle<Pagamento> {
 
    
    public ControlePagamento() {
        super(Pagamento.class);
    }

   

    public List<Pagamento> findByAluno(Aluno a) {
        EntityManager em = getEntityManager();
        TypedQuery<Pagamento> consulta = em.createNamedQuery("Pagamento.findByAluno", Pagamento.class);
        String parSQL;
        consulta.setParameter("aluno", a);
        return consulta.getResultList();
    }
     public Pagamento findByAlunoLast(Aluno a) {
        EntityManager em = getEntityManager();
        TypedQuery<Pagamento> consulta = em.createNamedQuery("Pagamento.findByAlunoLast", Pagamento.class);
        String parSQL;
        consulta.setParameter("aluno", a);
        return consulta.getSingleResult();
    }
     

}
