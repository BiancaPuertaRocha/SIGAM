/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Treinador;

/**
 *
 * @author Aluno
 */
public class ControleTreinador extends Controle<Treinador>{
    
    public ControleTreinador() {
        super(Treinador.class);
    }
    public List<Treinador> findByNome(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Treinador> consulta = em.createNamedQuery("Treinador.findByNome", Treinador.class);
        String parSQL;
        parSQL = "%" + nome + "%";
        consulta.setParameter("nome", parSQL);
        return consulta.getResultList();
    }
     public Treinador findByCodigo(int cod) {
        EntityManager em = getEntityManager();
        TypedQuery<Treinador> consulta = em.createNamedQuery("Secretario.findByCodigo", Treinador.class);
        consulta.setParameter("codigo", cod);
        return consulta.getSingleResult();
    }
}

