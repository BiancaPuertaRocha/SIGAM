package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="Funcionario")
@DiscriminatorValue("FUNCIONARIO")
@DiscriminatorColumn(name="DTYPE",discriminatorType = DiscriminatorType.STRING,length = 20)
public class Funcionario extends Pessoa implements Serializable{
    @Column(name = "salario")
    private Double salario;
    @Column(name = "hrEntrada")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hrEntrada;
    @Column(name = "hrSaida")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hrSaida;

    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Date getHrEntrada() {
        return hrEntrada;
    }

    public void setHrEntrada(Date hrEntrada) {
        this.hrEntrada = hrEntrada;
    }

    public Date getHrSaida() {
        return hrSaida;
    }

    public void setHrSaida(Date hrSaida) {
        this.hrSaida = hrSaida;
    }

}
