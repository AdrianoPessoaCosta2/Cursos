package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Osvaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000,20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        System.out.println("-------------------");
//        relatorio.relatorioPagamentoGerente(g);
//        relatorio.relatorioPagamentoVendededor(v);//
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-------------------");
        relatorio.relatorioPagamentoGenerico(v);


    }

}
