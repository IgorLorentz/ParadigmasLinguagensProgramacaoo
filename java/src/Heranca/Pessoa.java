package Heranca;

public class Pessoa {
    Pessoa() {

    }

    Pessoa(String nome) {
        this.nome = nome;
    }

    protected String nome;
    protected String logradouro;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected int cep;
    protected int telefone;
    protected String email;
}
