
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Matricula")
public class Matricula implements Serializable{
    @Id
    @OneToOne(mappedBy = "codigo", cascade = CascadeType.ALL, optional = false)
    @Column(name="codigoPessoa")
    private Pessoa p;
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Pagamento> listaPagamentos; 
    
}
