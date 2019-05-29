package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Mauricio";
        professor.matricula = "1";
        professor.rg = "30845022-1";
        professor.cpf = "2998874856";

        Professor prof2 = new Professor ();

        prof2.nome = "Mary";
        prof2.matricula = "2";
        prof2.rg = "547862-6";
        prof2.cpf = "45682578985";



        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
        System.out.println("-------------------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
        System.out.println(prof2.cpf);


    }
}
