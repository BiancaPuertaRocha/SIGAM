
package model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TYPE",discriminatorType = DiscriminatorType.STRING,length = 20)
@DiscriminatorValue("PESSOA")
@NamedQueries({
    @NamedQuery(name="Pessoa.findByNome",
                query="SELECT p FROM Pessoa p where p.nome like :nome"),
    @NamedQuery(name="Pessoa.findByLoginESenha",
                query="SELECT p FROM Pessoa p WHERE p.login = :login and p.senha = :senha")
}) 
@Table(name="Pessoa")
public class Pessoa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;
    @Column(name="nome")
    private String nome;
    @Column(name="telefone")
    private String telefone;
    @Column(name="dataNasc")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNasc;
    @Column(name="cidade")
    private String cidade;
    @Column(name="bairro")
    private String bairro;
    @Column(name="rua")
    private String rua;
    @Column(name="numero")
    private int numero;
    @Column(name="login")
    private String login;
    @Column(name="senha")
    private String senha;
    @Column(name="cpf")
    private String cpf;
    @Column(name="rg")
    private String rg;
    @Column(name="email")
    private String email;
    @Lob
    @Column(name="imagem")
    private byte[] imagem;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
