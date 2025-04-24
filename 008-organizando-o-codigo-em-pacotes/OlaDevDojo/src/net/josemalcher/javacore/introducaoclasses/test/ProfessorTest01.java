package net.josemalcher.javacore.introducaoclasses.test;

import net.josemalcher.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jose Malcher";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("O nome do professor é "+professor.nome + " tem " + professor.idade + " anos") ;
    }
}
