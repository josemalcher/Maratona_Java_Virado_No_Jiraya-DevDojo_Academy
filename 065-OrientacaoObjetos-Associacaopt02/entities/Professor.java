package entities;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos; // associação 1 para muitos

    public Professor(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>(); // Boa prática: inicializar a coleção
    }

    public void adicionaAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos do Professor " + this.nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }


}
