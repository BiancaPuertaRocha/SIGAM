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
import model.Caixa;
import model.Funcionario;
import model.Secretario;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

import util.Conversoes;

public class ControleCaixa extends Controle<Caixa>{
    
    private static Caixa caixa;

    public static Caixa getCaixa() {
        return caixa;
    }

    public static void setCaixa(Caixa caixa) {
        ControleCaixa.caixa = caixa;
    }
    
    public ControleCaixa() {
        super(Caixa.class);
    }
    
    public List<Caixa> findByDatas(String data1, String data2) {
        EntityManager em = getEntityManager();
        TypedQuery<Caixa> consulta = em.createNamedQuery("Caixa.findByData", Caixa.class);
        consulta.setParameter("data1", Conversoes.getStringToDate(data1));
        consulta.setParameter("data2", Conversoes.getStringToDate(data2));
        consulta.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return consulta.getResultList();
    }
     public Caixa findByCodigo(int cod) {
        EntityManager em = getEntityManager();
        TypedQuery<Caixa> consulta = em.createNamedQuery("Caixa.findByCodigo", Caixa.class);
        consulta.setParameter("codigo", cod);
        consulta.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return consulta.getSingleResult();
    }
     public Caixa findByAbertoFuncionario(Secretario f, Date data) {
        EntityManager em = getEntityManager();
        TypedQuery<Caixa> consulta = em.createNamedQuery("Caixa.findByAbertoFuncionario", Caixa.class);
        consulta.setParameter("secretario", f);
        consulta.setParameter("data", data);
        consulta.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return consulta.getSingleResult();
    }
     public List<Caixa> findAll() {
        EntityManager em = getEntityManager();
        TypedQuery<Caixa> consulta = em.createNamedQuery("Caixa.findAll", Caixa.class);
        String parSQL;
         consulta.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return consulta.getResultList();
    }
     
   
    
}
