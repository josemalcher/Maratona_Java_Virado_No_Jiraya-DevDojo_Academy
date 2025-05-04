package entities;


public class Aluno {
    private String nome;
    private Turma turma; // Referência para Turma

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void entrarNaTurma(Turma novaTurma) {

        this.turma = novaTurma;
        turma.adicionarAluno(this);
    }

    public void mostrarTurma() {
        if (turma != null) {
            System.out.println(nome + " está na " + turma.getCodigo());
        }
    }

}