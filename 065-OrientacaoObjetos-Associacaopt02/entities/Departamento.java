package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Professor> professores;

    public Departamento(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionaProfessor(Professor professor) {
        professores.add(professor);
    }

    public void relatorio() {
        System.out.println("Departamento: " + this.nome);
        System.out.println("Total Professores: " + professores.size());
        System.out.println("--- Relação Professor/Alunos ---");
        for (Professor prof : professores) {
            prof.listarAlunos();
            System.out.println();
        }

    }
}
