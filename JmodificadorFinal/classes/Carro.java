package br.com.abc.javacore.JmodificadorFinal.classes;


public class Carro {
    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String marco;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marco='" + marco + '\'' +
                '}';
    }
    public final void imprime(){
        System.out.println("Imprimindo um carro");
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }
}
