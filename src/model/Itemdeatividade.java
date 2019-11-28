/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "ItemDeAtividade")
@NamedQueries({
    @NamedQuery(name = "Itemdeatividade.findAll", query = "SELECT i FROM Itemdeatividade i"),
    @NamedQuery(name = "Itemdeatividade.findByAtividade", query = "SELECT i FROM Itemdeatividade i WHERE i.itemdeatividadePK.atividade = :atividade"),
    @NamedQuery(name = "Itemdeatividade.findByFicha", query = "SELECT i FROM Itemdeatividade i WHERE i.itemdeatividadePK.ficha = :ficha")})
public class Itemdeatividade implements Serializable {
    @EmbeddedId
    protected ItemdeatividadePK itemdeatividadePK;
   @ManyToOne
   @JoinColumn(referencedColumnName = "codigo", name = "atividade", nullable = false)
    private Atividade atividade;
   @ManyToOne
    @JoinColumn(referencedColumnName = "codigo", name = "ficha", nullable = false)
    private Ficha ficha;
    @Column(name = "repeticoes")
    private Integer repeticoes;
    @Column(name = "series")
    private Integer series;
    @Column(name = "duracao")
    private Integer duracao;

    public Itemdeatividade() {
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Itemdeatividade(ItemdeatividadePK itemdeatividadePK) {
        this.itemdeatividadePK = itemdeatividadePK;
    }

    public Itemdeatividade(int atividade, int ficha) {
        this.itemdeatividadePK = new ItemdeatividadePK(atividade, ficha);
    }

    public ItemdeatividadePK getItemdeatividadePK() {
        return itemdeatividadePK;
    }

    public void setItemdeatividadePK(ItemdeatividadePK itemdeatividadePK) {
        this.itemdeatividadePK = itemdeatividadePK;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemdeatividadePK != null ? itemdeatividadePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemdeatividade)) {
            return false;
        }
        Itemdeatividade other = (Itemdeatividade) object;
        if ((this.itemdeatividadePK == null && other.itemdeatividadePK != null) || (this.itemdeatividadePK != null && !this.itemdeatividadePK.equals(other.itemdeatividadePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Itemdeatividade[ itemdeatividadePK=" + itemdeatividadePK + " ]";
    }
    
}
