package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Chica da silva", "123.222.333-44", 4500, "544589-45");
     //   funcionario.init("Chica da silva", "123.222.333-44", 4500, "544589-45");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprime();
        funcionario2.imprime();
    }
}
