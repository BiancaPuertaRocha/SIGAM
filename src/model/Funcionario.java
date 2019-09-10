
package model;

import java.util.Date;


public class Funcionario extends Pessoa{
    private float salario;
    private String obsSaude;
    private Date hrEntrada;
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
