/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Pessoa;

public class ControlePessoa extends Controle<Pessoa> {

    public ControlePessoa() {
        super(Pessoa.class);
    }

    public List<Pessoa> findByNome(String nome) {
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> consulta = em.createNamedQuery("Pessoa.findByNome", Pessoa.class);
        String parSQL;
        parSQL = "%" + nome + "%";
        consulta.setParameter("nome", parSQL);
        return consulta.getResultList();
    }
    public Pessoa findByLoginSenha(String login, String senha) {
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> consulta = em.createNamedQuery("Pessoa.findByLoginESenha", Pessoa.class);
        consulta.setParameter("login", login);
        consulta.setParameter("senha", senha);
        return consulta.getSingleResult();
    }

}
