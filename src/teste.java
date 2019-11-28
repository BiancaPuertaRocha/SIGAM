
import control.ControleCaixa;
import control.ControleSecretario;
import java.util.Date;
import model.Caixa;
import model.Secretario;
import util.Conversoes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bianca
 */
public class teste {

    private static ControleSecretario cp = new ControleSecretario();
    private static ControleCaixa cont  =new ControleCaixa();
    public static void main(String[] args) {
        System.out.println(Conversoes.getStringToTime("03:00").toString());
        Secretario p = new Secretario();
        p.setNome("Abner jose da silva");
        p.setCidade("sao paulo");
        p.setBairro("vila dois");
        p.setCpf("487.440.818-47");
        p.setDataNasc(new Date());
        p.setEmail("um@dois.com");
        p.setLogin("abner");
        p.setNumero(456);
        p.setRg("59.079.865-0");
        p.setSenha("abner");
        p.setTelefone("(18)98176-9018");
        p.setDepartamento("Administração");
        Date d = new Date();
        p.setHrEntrada(new Date());
        d.setMinutes(d.getMinutes() + 1);
        p.setHrSaida(d);

        p.setSalario(5000.00);
        p.setTipo(true);
        p.setRua("rua um");
        
        cp.persist(p);
        
        Caixa c = new Caixa();
        c.setData(new Date());
        c.setEntradas(0.0);
        c.setSaidas(0.0);
        c.setHrAbertura(new Date());
        c.setSecretario(p);
        cont.persist(c);
        

    }
}
