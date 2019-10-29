/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Aluno
 */
@Embeddable
public class ItemdeatividadePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "atividade", insertable=false, updatable=false)
    private int atividade;
    @Basic(optional = false)
    @Column(name = "ficha", insertable=false, updatable=false)
    private int ficha;

    public ItemdeatividadePK() {
    }

    public ItemdeatividadePK(int atividade, int ficha) {
        this.atividade = atividade;
        this.ficha = ficha;
    }

    public int getAtividade() {
        return atividade;
    }

    public void setAtividade(int atividade) {
        this.atividade = atividade;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) atividade;
        hash += (int) ficha;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemdeatividadePK)) {
            return false;
        }
        ItemdeatividadePK other = (ItemdeatividadePK) object;
        if (this.atividade != other.atividade) {
            return false;
        }
        if (this.ficha != other.ficha) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ItemdeatividadePK[ atividade=" + atividade + ", ficha=" + ficha + " ]";
    }
    
}
