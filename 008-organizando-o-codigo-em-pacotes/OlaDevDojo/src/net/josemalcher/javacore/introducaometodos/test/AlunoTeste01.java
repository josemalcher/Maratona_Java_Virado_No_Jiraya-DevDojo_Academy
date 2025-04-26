package net.josemalcher.javacore.introducaometodos.test;

import net.josemalcher.javacore.introducaometodos.dominio.AlunoEx1;

public class AlunoTeste01 {
    public static void main(String[] args) {
        AlunoEx1 alunoEx1 = new AlunoEx1("JOSE", 3);
        alunoEx1.setNota(0, 10);
        alunoEx1.setNota(1, 10);
        alunoEx1.setNota(2, 10);

        System.out.println("Média de " + alunoEx1.getNome() + ": " + alunoEx1.calcularMedia());
    }
}
