package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.customexceptions.LoginInalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInalidoException{
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeCados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuarioBancoDeDados.equals(usuarioDigitado)|| !senhaBancoDeCados.equals(senhaDigitada)){
            throw new LoginInalidoException();
         }else{
            System.out.println("Logado");
        }

    }

}
