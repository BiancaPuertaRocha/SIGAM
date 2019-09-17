
package view;
import control.ControleSecretario;
import model.Secretario;
public class teste {
    public static void main(String[] args) {
        ControleSecretario cs = new ControleSecretario();
        Secretario f = new Secretario();
        f.setCodigo(1);
        cs.persist(f);
        
    }
}
