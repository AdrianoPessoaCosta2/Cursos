package br.com.abc.javacore.Isobrescrita.test;

import br.com.abc.javacore.Isobrescrita.Classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p =  new Pessoa();
        p.setNome("Joaquim na esquina");
        p.setIdade(300);
        Pessoa p2 =  new Pessoa();
        p2.setNome("Joao na esquina");
        p2.setIdade(200);
        System.out.println(p2);
        System.out.println(p);
    }
}
