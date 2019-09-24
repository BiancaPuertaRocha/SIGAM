package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-24T11:17:09")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ extends Pessoa_ {

    public static volatile SingularAttribute<Funcionario, Date> hrSaida;
    public static volatile SingularAttribute<Funcionario, Date> hrEntrada;
    public static volatile SingularAttribute<Funcionario, Float> salario;
    public static volatile SingularAttribute<Funcionario, String> obsSaude;

}