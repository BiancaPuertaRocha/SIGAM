/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Secretario;

public class ControleSecretario extends Controle<Secretario>{
    
    private static Secretario logado;
    
    public ControleSecretario() {
        super(Secretario.class);
    }

    public static Secretario getLogado() {
        return logado;
    }

    public static void setLogado(Secretario logado) {
        ControleSecretario.logado = logado;
    }
    
    public List<Secretario> findByNome(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Secretario> consulta = em.createNamedQuery("Secretario.findByNome", Secretario.class);
        String parSQL;
        parSQL = "%" + nome + "%";
        consulta.setParameter("nome", parSQL);
        return consulta.getResultList();
    }
     public Secretario findByCodigo(int cod) {
        EntityManager em = getEntityManager();
        TypedQuery<Secretario> consulta = em.createNamedQuery("Secretario.findByCodigo", Secretario.class);
        consulta.setParameter("codigo", cod);
        return consulta.getSingleResult();
    }
    
}
