package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoas {

    private double salario;

    {
        System.out.println("Dentro de inicialização de funcionario");
    }
    {
        System.out.println("Dentro de inicialização de funcionario2");
    }
   static {
        System.out.println("Dentro de inicialização de funcionario estatico");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }
    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();

    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu "+super.nome+" recebi o pagamento de  " +this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
