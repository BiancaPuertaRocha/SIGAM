
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
@Entity
public class Matricula implements Serializable{
    @Id
    @JoinColumn(name = "aluno", referencedColumnName = "codigo")
    private Pessoa aluno;
    @Column(name = "atualizade")
    private boolean atualizade;
    
    
}
