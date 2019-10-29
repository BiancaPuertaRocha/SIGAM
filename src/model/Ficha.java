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
import javax.persistence.Id;
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
@Table(name = "ficha")
@NamedQueries({
    @NamedQuery(name = "Ficha.findAll", query = "SELECT f FROM Ficha f"),
    @NamedQuery(name = "Ficha.findByCodigo", query = "SELECT f FROM Ficha f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Ficha.findByPeso", query = "SELECT f FROM Ficha f WHERE f.peso = :peso"),
    @NamedQuery(name = "Ficha.findByAltura", query = "SELECT f FROM Ficha f WHERE f.altura = :altura"),
    @NamedQuery(name = "Ficha.findByDataAv", query = "SELECT f FROM Ficha f WHERE f.dataAv = :dataAv"),
    @NamedQuery(name = "Ficha.findByProxAv", query = "SELECT f FROM Ficha f WHERE f.proxAv = :proxAv"),
    })
public class Ficha implements Serializable {

   
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "peso")
    private double peso;
    @Basic(optional = false)
    @Column(name = "altura")
    private double altura;
    @Basic(optional = false)
    @Column(name = "dataAv")
    @Temporal(TemporalType.DATE)
    private Date dataAv;
    @Column(name = "proxAv")
    @Temporal(TemporalType.DATE)
    private Date proxAv;
    @Column(name = "quadril")
    private Double quadril;
    @Column(name = "abdomen")
    private Double abdomen;
    @Column(name = "bicepsEsq")
    private Double bicepsEsq;
    @Column(name = "bicepsDir")
    private Double bicepsDir;
    @Column(name = "antebracoEsq")
    private Double antebracoEsq;
    @Column(name = "antebracoDir")
    private Double antebracoDir;
    @Column(name = "cintura")
    private Double cintura;
    @Column(name = "coxaEsq")
    private Double coxaEsq;
    @Column(name = "coxaDir")
    private Double coxaDir;
    @Column(name = "panturrilhaEsq")
    private Double panturrilhaEsq;
    @Column(name = "panturrilhaDir")
    private Double panturrilhaDir;
    
    @OneToMany(mappedBy = "ficha", cascade = CascadeType.ALL)
    private List<Itemdeatividade> itemdeatividades;

    public List<Itemdeatividade> getItemdeatividades() {
        return itemdeatividades;
    }

    public void setItemdeatividades(List<Itemdeatividade> itemdeatividades) {
        this.itemdeatividades = itemdeatividades;
    }

    public Ficha() {
    }

    public Ficha(Integer codigo) {
        this.codigo = codigo;
    }

    public Ficha(Integer codigo, double peso, double altura, Date dataAv) {
        this.codigo = codigo;
        this.peso = peso;
        this.altura = altura;
        this.dataAv = dataAv;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getDataAv() {
        return dataAv;
    }

    public void setDataAv(Date dataAv) {
        this.dataAv = dataAv;
    }

    public Date getProxAv() {
        return proxAv;
    }

    public void setProxAv(Date proxAv) {
        this.proxAv = proxAv;
    }

    public Double getQuadril() {
        return quadril;
    }

    public void setQuadril(Double quadril) {
        this.quadril = quadril;
    }

    public Double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Double abdomen) {
        this.abdomen = abdomen;
    }

    public Double getBicepsEsq() {
        return bicepsEsq;
    }

    public void setBicepsEsq(Double bicepsEsq) {
        this.bicepsEsq = bicepsEsq;
    }

    public Double getBicepsDir() {
        return bicepsDir;
    }

    public void setBicepsDir(Double bicepsDir) {
        this.bicepsDir = bicepsDir;
    }

    public Double getAntebracoEsq() {
        return antebracoEsq;
    }

    public void setAntebracoEsq(Double antebracoEsq) {
        this.antebracoEsq = antebracoEsq;
    }

    public Double getAntebracoDir() {
        return antebracoDir;
    }

    public void setAntebracoDir(Double antebracoDir) {
        this.antebracoDir = antebracoDir;
    }

    public Double getCintura() {
        return cintura;
    }

    public void setCintura(Double cintura) {
        this.cintura = cintura;
    }

    public Double getCoxaEsq() {
        return coxaEsq;
    }

    public void setCoxaEsq(Double coxaEsq) {
        this.coxaEsq = coxaEsq;
    }

    public Double getCoxaDir() {
        return coxaDir;
    }

    public void setCoxaDir(Double coxaDir) {
        this.coxaDir = coxaDir;
    }

    public Double getPanturrilhaEsq() {
        return panturrilhaEsq;
    }

    public void setPanturrilhaEsq(Double panturrilhaEsq) {
        this.panturrilhaEsq = panturrilhaEsq;
    }

    public Double getPanturrilhaDir() {
        return panturrilhaDir;
    }

    public void setPanturrilhaDir(Double panturrilhaDir) {
        this.panturrilhaDir = panturrilhaDir;
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
        if (!(object instanceof Ficha)) {
            return false;
        }
        Ficha other = (Ficha) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ficha[ codigo=" + codigo + " ]";
    }
    
}
