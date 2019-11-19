
package model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Aluno")
@DiscriminatorValue("ALUNO")
@NamedQueries({
   
    @NamedQuery(name="Aluno.findByCodigo",
                query="SELECT p FROM Aluno p where p.codigo = :codigo"),
    @NamedQuery(name="Aluno.findByNome",
                query="SELECT p FROM Aluno p where p.nome like :nome"),
    @NamedQuery(name="Aluno.desatualizadoNome",
                query="SELECT p FROM Aluno p where p.status = false and p.nome like :nome")
}) 
public class Aluno extends Pessoa{
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Pagamento> listaPagamentos; 
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Ficha> listaFichas; 
    @Column(name = "dataUltima")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataUltima;
    @Column(name="freqAtFisica", length = 20)
    private String freqAtFisica;
    @Column(name="probOrtop", length = 50)
    private String probOrtop;
    @Column(name="fumante")
    private boolean fumante;
    @Column(name="infSobrepeso", length = 50)
    private String infSobrepeso;
    @Column(name="colesterol", length = 20)
    private String colesterol;
    @Column(name="medicamentos", length = 100)
    private String medicamentos;
    @Column(name="status")
    private boolean status;
    
    

    public String getFreqAtFisica() {
        return freqAtFisica;
    }

    public void setFreqAtFisica(String freqAtFisica) {
        this.freqAtFisica = freqAtFisica;
    }

    public String getProbOrtop() {
        return probOrtop;
    }

    public void setProbOrto(String probOrto) {
        this.probOrtop = probOrto;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public String getInfSobrepeso() {
        return infSobrepeso;
    }

    public void setInfSobrepeso(String infSobrepeso) {
        this.infSobrepeso = infSobrepeso;
    }

    public String getColesterol() {
        return colesterol;
    }

    public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Pagamento> getListaPagamentos() {
        return listaPagamentos;
    }

    public List<Ficha> getListaFichas() {
        return listaFichas;
    }

    public void setListaFichas(List<Ficha> listaFichas) {
        this.listaFichas = listaFichas;
    }

    public Date getDataUltima() {
        return dataUltima;
    }

    public void setDataUltima(Date dataUltima) {
        this.dataUltima = dataUltima;
    }

    public void setListaPagamentos(List<Pagamento> listaPagamentos) {
        this.listaPagamentos = listaPagamentos;
    }
    public void atualizaStatus(boolean sta){
        status = sta;
    }
    
}
