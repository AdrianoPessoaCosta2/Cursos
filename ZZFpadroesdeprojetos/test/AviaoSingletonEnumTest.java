package br.com.abc.javacore.ZZFpadroesdeprojetos.test;

import br.com.abc.javacore.ZZFpadroesdeprojetos.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAsento("1A");
        AviaoSingletonEnum.agendarAsento("1A");
    }
}
