package br.com.abc.javacore.ZZFpadroesdeprojetos.test;

import br.com.abc.javacore.ZZFpadroesdeprojetos.classes.Aviao;

public class AviaoTest {
    public static void main(String[] args) {
        agendarAsento("1A");
        agendarAsento("1A");
    }

    private static void agendarAsento(String assento){
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
