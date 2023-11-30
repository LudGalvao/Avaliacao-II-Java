package orm.modelo;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "alunosinfo")
public class Escola {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;
    private String naturalidade;
    private String endereco;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public  void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade(){
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


}
