/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@DiscriminatorValue("TREINADOR")
//@NamedQueries({
//    @NamedQuery(name="Treinador.findByNome",
//                query="SELECT p FROM Treinador p where p.nome like :nome"),
//    @NamedQuery(name="Treinador.findByLoginESenha",
//                query="SELECT p FROM Treinador p WHERE p.login = :login and p.senha = :senha")
//}) 
public class Treinador extends Funcionario implements Serializable{
    private String especialidade;
    private String CREF;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCREF() {
        return CREF;
    }

    public void setCREF(String CREF) {
        this.CREF = CREF;
    }
    
}
