package br.com.abc.javacore.JmodificadorFinal.test;

import br.com.abc.javacore.JmodificadorFinal.classes.Carro;
import br.com.abc.javacore.JmodificadorFinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.getComprador();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());

    }
}
