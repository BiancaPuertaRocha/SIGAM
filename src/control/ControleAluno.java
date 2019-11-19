/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Aluno;


public class ControleAluno extends Controle<Aluno> {
    private static Aluno logado;
    
    public ControleAluno() {
        super(Aluno.class);
    }

    public static Aluno getLogado() {
        return logado;
    }

    public static void setLogado(Aluno logado) {
        ControleAluno.logado = logado;
    }

    public List<Aluno> findByNome(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Aluno> consulta = em.createNamedQuery("Aluno.findByNome", Aluno.class);
        String parSQL;
        parSQL = "%" + nome + "%";
        consulta.setParameter("nome", parSQL);
        return consulta.getResultList();
    }
     public Aluno findByCodigo(int cod) {
        EntityManager em = getEntityManager();
        TypedQuery<Aluno> consulta = em.createNamedQuery("Aluno.findByCodigo", Aluno.class);
        consulta.setParameter("codigo", cod);
        return consulta.getSingleResult();
    }
     public List<Aluno> findDesatualizado(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Aluno> consulta = em.createNamedQuery("Aluno.desatualizadoNome", Aluno.class);
        consulta.setParameter("nome","%"+ nome+"%");
        return consulta.getResultList();
    }

}
