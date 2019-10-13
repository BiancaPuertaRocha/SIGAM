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
@DiscriminatorValue("SECRETARIO")
@NamedQueries({
    @NamedQuery(name="Secretario.findByNome",
                query="SELECT p FROM Secretario p where p.nome like :nome"),
    @NamedQuery(name="Secretario.findByCodigo",
                query="SELECT p FROM Secretario p where p.codigo = :codigo"),
    @NamedQuery(name="Secretario.findByLoginESenha",
                query="SELECT p FROM Secretario p WHERE p.login = :login and p.senha = :senha")
}) 
@Table(name="Secretario")
public class Secretario extends Funcionario implements Serializable {

    @Column(name = "departamento")
    private String departamento;
    @Column(name = "tipo")
    private boolean tipo;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

}
