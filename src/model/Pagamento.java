/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pagamento")
public class Pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "dias", nullable = false)
    private int dias;
    @Column(name = "valor", nullable = false)
    private double valor;
    @Column(name = "dataPag", nullable = false)
    private int dataPag;
    @ManyToOne
    @JoinColumn(referencedColumnName = "codigo", name = "aluno")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(referencedColumnName = "codigo", name = "caixa", nullable = false)
    private Caixa caixa;

    public int getCodigo() {
        return codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

   
    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDataPag() {
        return dataPag;
    }

    public void setDataPag(int dataPag) {
        this.dataPag = dataPag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pagamento other = (Pagamento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
