
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Matricula")
public class Matricula implements Serializable{
    @Id
    @JoinColumn(referencedColumnName = "codigo", name = "codigoPessoa", nullable = false)
    private Pessoa codigoPessoa;
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Pagamento> listaPagamentos; 
    
    
}
