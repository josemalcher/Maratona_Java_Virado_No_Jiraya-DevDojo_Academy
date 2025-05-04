package entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarAluno(Aluno aluno) {
        /*alunos.add(aluno);
        if (aluno.getTurma() != this) {
            aluno.entrarNaTurma(this);
        }*/
        if (aluno == null || alunos.contains(aluno)) {
            return; // Não adiciona se for nulo ou já existir
        }

        alunos.add(aluno);
        if (aluno.getTurma() != this) {
            aluno.entrarNaTurma(this); // Sincroniza o lado do aluno
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos da turma " + codigo + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }

}