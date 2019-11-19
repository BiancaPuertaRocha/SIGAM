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
import model.Despesa;



import util.Conversoes;

public class ControleDespesa extends Controle<Despesa>{
    
   
    
    public ControleDespesa() {
        super(Despesa.class);
    }
    
    public List<Despesa> findByDatas(String data1, String data2) {
        EntityManager em = getEntityManager();
        TypedQuery<Despesa> consulta = em.createNamedQuery("Despesa.findByDataVencimento", Despesa.class);
        consulta.setParameter("data1", Conversoes.getDateOfString(data1));
        consulta.setParameter("data2", Conversoes.getDateOfString(data2));
        return consulta.getResultList();
    }
     public Despesa findByCodigo(int cod) {
        EntityManager em = getEntityManager();
        TypedQuery<Despesa> consulta = em.createNamedQuery("Despesa.findByCodigo", Despesa.class);
        consulta.setParameter("codigo", cod);
        return consulta.getSingleResult();
    }

     
   
    
}
