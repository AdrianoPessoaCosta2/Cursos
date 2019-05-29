package br.com.abc.javacore.Oexception.customexceptions;

public class LoginInalidoException extends Exception{

    public LoginInalidoException(){
        super("Usuario ou senha inválidos");
    }

}
