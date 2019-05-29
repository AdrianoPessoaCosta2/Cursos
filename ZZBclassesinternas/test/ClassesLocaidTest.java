package br.com.abc.javacore.ZZBclassesinternas.test;

public class ClassesLocaidTest {
    private String nome = "Willan";
    public void fazAlgumaCoisa(){
        String sobrenome = "Suane";
        class Interna{
            public  void imprimeNomeExterno(){
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }
    public static void main(String[] args) {
        ClassesLocaidTest externa = new ClassesLocaidTest();
        externa.fazAlgumaCoisa();
    }
}
