package net.josemalcher.javacore.introducaometodos.dominio;

public class AlunoEx1 {
    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public AlunoEx1(String nome, int qntProvas) {
        this.nome = nome;
        this.notas = new double[qntProvas];
    }

    public void setNota(int indice, double nota) {
        if (indice >= 0 && indice < notas.length && nota >= 0 && nota <= 10) {
            notas[indice] = nota;
        } else {
            System.out.println("Nota inválida ou índice inválido!");
        }
    }

    public double calcularMedia() {
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        return total / notas.length;
    }

}
