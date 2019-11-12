/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Atividade;


public class ControleAtividade extends Controle<Atividade> {

    public ControleAtividade() {
        super(Atividade.class);
    }

    public List<Atividade> findByDescricao(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Atividade> consulta = em.createNamedQuery("Atividade.findByDescricao", Atividade.class);
        String parSQL;
        parSQL = "%" + nome + "%";
        consulta.setParameter("descricao", parSQL);
        return consulta.getResultList();
    }
     public Atividade findByCodigo(int cod) {
        EntityManager em = getEntityManager();
        TypedQuery<Atividade> consulta = em.createNamedQuery("Atividade.findByCodigo", Atividade.class);
        consulta.setParameter("codigo", cod);
        return consulta.getSingleResult();
    }

}
