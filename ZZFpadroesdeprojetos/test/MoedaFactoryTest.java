package br.com.abc.javacore.ZZFpadroesdeprojetos.test;

import br.com.abc.javacore.ZZFpadroesdeprojetos.classes.Moeda;
import br.com.abc.javacore.ZZFpadroesdeprojetos.classes.MoedaFactory;
import br.com.abc.javacore.ZZFpadroesdeprojetos.classes.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        System.out.println(moeda.getSimbolo());
    }
}
