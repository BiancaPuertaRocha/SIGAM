/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Caixa")
@NamedQueries({
    @NamedQuery(name = "Caixa.findAll", query = "SELECT c FROM Caixa c"),
    @NamedQuery(name = "Caixa.findByCodigo", query = "SELECT c FROM Caixa c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Caixa.findByData", query = "SELECT c FROM Caixa c WHERE c.data between :data1 and :data2"),
    @NamedQuery(name = "Caixa.findByAbertoFuncionario", query = "SELECT c FROM Caixa c WHERE c.secretario =  :secretario and c.data = :data and c.hrFechamento = null"),
    
    @NamedQuery(name = "Caixa.findBySaidas", query = "SELECT c FROM Caixa c WHERE c.saidas = :saidas")})
public class Caixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "hrAbertura")
    @Temporal(TemporalType.TIME)
    private Date hrAbertura;
    @Column(name = "hrFechamento")
    @Temporal(TemporalType.TIME)
    private Date hrFechamento;
    @Column(name = "data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(name = "saldoInicial")
    private Double saldoInicial;
    @Column(name = "saldoFinal")
    private Double saldoFinal;
    @Column(name = "entradas")
    private Double entradas;
    @Column(name = "saidas")
    private Double saidas;
    @ManyToOne
    @JoinColumn(referencedColumnName = "codigo", name = "secretario")
    private Secretario secretario;
    
    @OneToMany(mappedBy = "caixa", cascade = CascadeType.ALL)
    private List<Despesa> listaDespesas;
    
    @OneToMany(mappedBy = "caixa", cascade = CascadeType.ALL)
    private List<Pagamento> listaPagamentos;
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Despesa> getListaDespesas() {
        return listaDespesas;
    }

    public void setListaDespesas(List<Despesa> listaDespesas) {
        this.listaDespesas = listaDespesas;
    }

    public List<Pagamento> getListaPagamentos() {
        return listaPagamentos;
    }

    public void setListaPagamentos(List<Pagamento> listaPagamentos) {
        this.listaPagamentos = listaPagamentos;
    }

    
    
    
    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }
    
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
        return "Caixa{" + "codigo=" + codigo + ", hrAbertura=" + hrAbertura + ", hrFechamento=" + hrFechamento + ", data=" + data + ", saldoInicial=" + saldoInicial + ", saldoFinal=" + saldoFinal + ", entradas=" + entradas + ", saidas=" + saidas + ", secretario=" + secretario + '}';
    }

   
    
}
