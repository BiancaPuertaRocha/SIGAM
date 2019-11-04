
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
                query="SELECT p FROM Aluno p where p.codigo = :codigo")
}) 
public class Aluno extends Pessoa{
    
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Pagamento> listaPagamentos; 
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Ficha> listaFichas; 
    @Column(name = "dataUltima")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataUltima;

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
    
    
}
