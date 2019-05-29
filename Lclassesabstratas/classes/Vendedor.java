package br.com.abc.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    @Override
    public void imprime() {
        System.out.println("Dentro do vendedor");
    }

    public Vendedor(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }


    @Override
    public void calculaSalario() {
        this.salario = salario + (salario*0.05);

    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
