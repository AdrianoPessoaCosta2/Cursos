package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoas;

public class HerancaTest {
    public static void main(String[] args) {

//        Pessoas p = new Pessoas("Gina");
        Endereco end = new Endereco();
//
//
//      //  p.setNome("Gina");
//        p.setCpf("12345");
//
//
//        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
//
//        p.setEndereco(end);
//
//        p.imprime();
        System.out.println("--------------------");
        Funcionario f = new Funcionario("Augusto");
       // f.setNome("Augusto");
        f.setCpf("98765");
        f.setSalario(15000);
        f.setEndereco(end);



       // f.imprime();
    }
}
