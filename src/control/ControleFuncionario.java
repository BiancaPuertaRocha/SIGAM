/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Funcionario;


/**
 *
 * @author bianca
 */
public class ControleFuncionario  extends Controle<Funcionario>{

    public ControleFuncionario() {
        super(Funcionario.class);
    }
    
    public List<Funcionario> findOnline() {
        EntityManager em = getEntityManager();
        Date d = new Date();
        
        d.setMonth(0);
        d.setDate(01);
        d.setYear(70);
        
        TypedQuery<Funcionario> consulta = em.createNamedQuery("Funcionario.findByHorario", Funcionario.class);
        consulta.setParameter("horario", d);
        return consulta.getResultList();
    }
}
