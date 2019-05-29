package br.com.abc.javacore.ZZFpadroesdeprojetos.test;

import br.com.abc.javacore.ZZFpadroesdeprojetos.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
    Pessoa p = new Pessoa.PessoaBuilder("Willian")
                .nomeDoMeio("Queiroz")
                .ultimoNome("Suane")
                .apelido("JyraiaBolado")
                .nomeDoPai("Willian")
                .build();
        System.out.println(p);

    }
}


