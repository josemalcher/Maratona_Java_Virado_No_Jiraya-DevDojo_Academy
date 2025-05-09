package entities;

public class Seminario {
    private String titulo;
    private int capacidade;

    private Aluno[] alunos;

    private Local local;

    public Seminario(String titulo, int capacidade) {
        this.titulo = titulo;
        this.capacidade = capacidade;
    }

    public Seminario(String titulo, int capacidade, Aluno[] alunos) {
        this.titulo = titulo;
        this.capacidade = capacidade;
        this.alunos = alunos;
    }

    public Seminario(String titulo, int capacidade, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.capacidade = capacidade;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
