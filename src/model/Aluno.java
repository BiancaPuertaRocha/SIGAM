
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno")
@DiscriminatorValue("ALUNO")
public class Aluno extends Pessoa{
    
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Pagamento> listaPagamentos; 
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Ficha> listaFichas; 

    public List<Pagamento> getListaPagamentos() {
        return listaPagamentos;
    }

    public void setListaPagamentos(List<Pagamento> listaPagamentos) {
        this.listaPagamentos = listaPagamentos;
    }
    
    
}
