/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("TREINADOR")
@NamedQueries({
    @NamedQuery(name = "Treinador.findByNome",
            query = "SELECT p FROM Treinador p where p.nome like :nome"),
    @NamedQuery(name = "Treinador.findByCodigo",
            query = "SELECT p FROM Treinador p where p.codigo = :codigo"),
    @NamedQuery(name = "Treinador.findByLoginESenha",
            query = "SELECT p FROM Treinador p WHERE p.login = :login and p.senha = :senha")
})
@Table(name = "Treinador")
public class Treinador extends Funcionario implements Serializable {

    @Column(name = "especialidade", length = 50, nullable = false)
    private String especialidade;
    @Column(name = "cref", length = 20, nullable = false)
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
