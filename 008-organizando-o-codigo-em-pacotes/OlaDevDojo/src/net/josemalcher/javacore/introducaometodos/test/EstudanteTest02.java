package net.josemalcher.javacore.introducaometodos.test;

import net.josemalcher.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Jose";
        estudante1.idade = 40;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Luciana";
        estudante2.idade = 35;
        estudante2.sexo = 'F';

        estudante1.imprimeDadosEstudante();
        estudante2.imprimeDadosEstudante();
    }
}
