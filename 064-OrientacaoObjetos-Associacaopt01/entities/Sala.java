package entities;

public class Sala {
    private Aluno[] alunos;

    public Sala(int capacidade) {
        alunos = new Aluno[capacidade];
    }

    public void adicionarAluno(Aluno aluno, int indice) {
        this.alunos[indice] = aluno;
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("- " + aluno.getNome());
            }
        }
    }
}
