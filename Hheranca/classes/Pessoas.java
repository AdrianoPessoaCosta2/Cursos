package br.com.abc.javacore.Hheranca.classes;

public class Pessoas{
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    public Pessoas(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }
    public Pessoas(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    static{
        System.out.println("Bloco de inicialização estatico");
    }
    {
        System.out.println("Dendtro do bloco de inicialização");
    } {
        System.out.println("Dendtro do bloco de inicialização2");
    }

    public void imprime(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Cpf: " +this.cpf);
        System.out.println("Endereço: " +this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



}

