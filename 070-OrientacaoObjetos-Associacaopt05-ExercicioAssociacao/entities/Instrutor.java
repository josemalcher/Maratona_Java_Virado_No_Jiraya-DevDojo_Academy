package entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor {
    private String nome;
    private List<Seminario> seminarios;

    public Instrutor(String nome) {
        this.nome = nome;
        this.seminarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addSeminario(Seminario seminario) {
        this.seminarios.add(seminario);
    }
    public void removeSeminario(Seminario seminario) {
        this.seminarios.remove(seminario);
    }
}
