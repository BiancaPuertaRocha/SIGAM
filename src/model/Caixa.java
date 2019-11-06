/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "caixa")
@NamedQueries({
    @NamedQuery(name = "Caixa.findAll", query = "SELECT c FROM Caixa c"),
    @NamedQuery(name = "Caixa.findByCodigo", query = "SELECT c FROM Caixa c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Caixa.findByHrAbertura", query = "SELECT c FROM Caixa c WHERE c.hrAbertura = :hrAbertura"),
    @NamedQuery(name = "Caixa.findByHrFechamento", query = "SELECT c FROM Caixa c WHERE c.hrFechamento = :hrFechamento"),
    @NamedQuery(name = "Caixa.findBySaldoInicial", query = "SELECT c FROM Caixa c WHERE c.saldoInicial = :saldoInicial"),
    @NamedQuery(name = "Caixa.findBySaldoFinal", query = "SELECT c FROM Caixa c WHERE c.saldoFinal = :saldoFinal"),
    @NamedQuery(name = "Caixa.findByEntradas", query = "SELECT c FROM Caixa c WHERE c.entradas = :entradas"),
    @NamedQuery(name = "Caixa.findBySaidas", query = "SELECT c FROM Caixa c WHERE c.saidas = :saidas")})
public class Caixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "hrAbertura")
    @Temporal(TemporalType.TIME)
    private Date hrAbertura;
    @Column(name = "hrFechamento")
    @Temporal(TemporalType.TIME)
    private Date hrFechamento;
    @Column(name = "saldoInicial")
    private Double saldoInicial;
    @Column(name = "saldoFinal")
    private Double saldoFinal;
    @Column(name = "entradas")
    private Double entradas;
    @Column(name = "saidas")
    private Double saidas;

    public Caixa() {
    }

    public Caixa(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getHrAbertura() {
        return hrAbertura;
    }

    public void setHrAbertura(Date hrAbertura) {
        this.hrAbertura = hrAbertura;
    }

    public Date getHrFechamento() {
        return hrFechamento;
    }

    public void setHrFechamento(Date hrFechamento) {
        this.hrFechamento = hrFechamento;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Double getEntradas() {
        return entradas;
    }

    public void setEntradas(Double entradas) {
        this.entradas = entradas;
    }

    public Double getSaidas() {
        return saidas;
    }

    public void setSaidas(Double saidas) {
        this.saidas = saidas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Caixa[ codigo=" + codigo + " ]";
    }
    
}