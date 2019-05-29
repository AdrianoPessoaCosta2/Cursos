package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

    //    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para gerencia:");
//        gerente.calcularPagamento();
//        System.out.println("Nome:" +gerente.getNome());
//        System.out.println("Salario desse mês:" +gerente.getSalario());
//    }
//    public void relatorioPagamentoVendededor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para vendedor:");
//        vendedor.calcularPagamento();
//        System.out.println("Nome:" +vendedor.getNome());
//        System.out.println("Salario desse mês:" +vendedor.getSalario());
//    }
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatorio de pagamento:");
        funcionario.calcularPagamento();
        System.out.println("Nome:" + funcionario.getNome());
        System.out.println("Salario desse mês:" + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total vendas: " +((Vendedor) funcionario).getTotalVendas());
        }
    }
}
