package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {

        abrirArquivo();

    }

    public static void criaArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado?" + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static String abrirArquivo() {
        File file = new File("Teste.txt");
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //          throw new Exception();
            //       System.out.println("Escrevendo no arquivo");
            return "valor";

        } finally {
            System.out.println("Fechar o arquivo");

        }

    }

}
