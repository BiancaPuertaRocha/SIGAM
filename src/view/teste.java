
package view;
import control.ControlePessoa;
import control.ControleSecretario;
import java.util.ArrayList;
import java.util.List;
import model.Secretario;
public class teste {
    public static void main(String[] args) {
        ControleSecretario cs = new ControleSecretario();
        ControlePessoa cp = new ControlePessoa();
        Secretario f = new Secretario();
        f.setCodigo(1);
        f.setNome("bia");
        f.setDepartamento("sei la");
        cs.persist(f);
        ArrayList<Secretario> lista = new ArrayList();
        lista.add((Secretario)cp.findByNome("bia").get(0));
        //System.out.println(cp.findByNome("bia").get(0) instanceof Secretario);
        
    }
}
