/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "atividade")

@NamedQueries({
    @NamedQuery(name = "Atividade.findAll", query = "SELECT a FROM Atividade a"),
    @NamedQuery(name = "Atividade.findByCodigo", query = "SELECT a FROM Atividade a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Atividade.findByEquipamentos", query = "SELECT a FROM Atividade a WHERE a.equipamentos = :equipamentos"),
    @NamedQuery(name = "Atividade.findByMusculo", query = "SELECT a FROM Atividade a WHERE a.musculo = :musculo"),
    @NamedQuery(name = "Atividade.findByDescricao", query = "SELECT a FROM Atividade a WHERE a.descricao = :descricao")})
public class Atividade implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "equipamentos")
    private String equipamentos;
    @Column(name = "musculo")
    private String musculo;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<Itemdeatividade> itemdeatividades;

    public List<Itemdeatividade> getItemdeatividades() {
        return itemdeatividades;
    }

    public void setItemdeatividades(List<Itemdeatividade> itemdeatividades) {
        this.itemdeatividades = itemdeatividades;
    }
    
    public Atividade() {
    }

    public Atividade(Integer codigo) {
        this.codigo = codigo;
    }

    public Atividade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getMusculo() {
        return musculo;
    }

    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof Atividade)) {
            return false;
        }
        Atividade other = (Atividade) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Atividade[ codigo=" + codigo + " ]";
    }
    
}
