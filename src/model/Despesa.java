package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Despesa")

public class Despesa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;
    @Column(name = "vencimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vencimento;
    @Column(name = "pagamento", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pagamento;
    @Column(name = "valor", nullable = true)
    private double valor;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "codigo", name = "caixa", nullable = false)
    private Caixa caixa;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
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
        final Despesa other = (Despesa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
