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
import javax.persistence.Temporal;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TYPE",discriminatorType = DiscriminatorType.STRING,length = 20)
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Pessoa implements Serializable{
    @Column(name = "salario")
    private float salario;
    @Column(name = "obsSaude")
    private String obsSaude;
    @Column(name = "hrEntrada")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hrEntrada;
    @Column(name = "hrSaida")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hrSaida;
   
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getObsSaude() {
        return obsSaude;
    }

    public void setObsSaude(String obsSaude) {
        this.obsSaude = obsSaude;
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
