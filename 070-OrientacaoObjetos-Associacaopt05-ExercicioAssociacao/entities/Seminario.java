package entities;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private int capacidade;

    private Local local;

    //private Aluno[] alunos;
    private List<Aluno> alunos = new ArrayList<>();
    private Instrutor instrutor;


    public Seminario(String titulo, int capacidade) {
        this.titulo = titulo;
        this.capacidade = capacidade;
    }

    public Seminario(String titulo, int capacidade, Local local) {
        this.titulo = titulo;
        this.capacidade = capacidade;
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

    /*public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }*/

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    // Associação com Aluno (um seminário pode ter muitos alunos)
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.setSeminario(this); // Bidirecional
    }

    public void setIntrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }
}
