package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pessoa;
import model.Secretario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T17:21:20")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ extends Pessoa_ {

    public static volatile SingularAttribute<Funcionario, Date> hrSaida;
    public static volatile SingularAttribute<Funcionario, Date> hrEntrada;
    public static volatile SingularAttribute<Funcionario, Secretario> secretario;
    public static volatile SingularAttribute<Funcionario, Float> salario;
    public static volatile SingularAttribute<Funcionario, String> obsSaude;
    public static volatile SingularAttribute<Funcionario, Pessoa> pes;

}