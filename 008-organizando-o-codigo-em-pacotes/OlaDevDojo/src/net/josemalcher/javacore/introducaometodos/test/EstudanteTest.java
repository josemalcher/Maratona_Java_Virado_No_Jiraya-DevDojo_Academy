package net.josemalcher.javacore.introducaometodos.test;

import net.josemalcher.javacore.introducaometodos.dominio.Estudante;
import net.josemalcher.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Jose";
        estudante1.idade = 40;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Luciana";
        estudante2.idade = 35;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);


    }
}
