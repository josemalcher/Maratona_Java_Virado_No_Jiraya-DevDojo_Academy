package app;

import entities.Aluno;
import entities.Local;
import entities.Professor;
import entities.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua tal tal");
        Aluno aluno1 = new Aluno("Jose", 40);
        Aluno aluno2 = new Aluno("Luciana", 38);
        Aluno aluno3 = new Aluno("Lurdes", 10);

        Aluno[] alunos = {aluno1, aluno2, aluno3};

        Professor prof1 = new Professor("Dr. Adriana", "Matemática");

        // Seminario seminario1 = new Seminario("Matemática Etc!", 4, alunos, local);
        Seminario seminario2 = new Seminario("Portugues Etc!", 2);

        // Seminario[] seminariosDisponiveis = {seminario1};

        // prof1.setSeminarios(seminariosDisponiveis);
        prof1.imprime();

    }
}
