package br.com.abc.javacore.ZZBclassesinternas.test;

public class ClassesInternasTest {
    private String nome = "Willian Jedi do DevDojo";

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
            System.out.println(this); //classe interna
            System.out.println(ClassesInternasTest.this); //refese a classe externa
        }
    }
    public static void main(String[] args) {
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClasseExterna();
 //       in2.verClasseExterna();
    }
}

//class Externa{
//    private String nome = "Willian Jedi do DevDojo";
//
//    class Interna{
//        public void verClasseExterna(){
//            System.out.println(nome);
//        }
//    }
//}
