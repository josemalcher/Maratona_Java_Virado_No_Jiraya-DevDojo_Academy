package app;

import entities.*;

import java.util.stream.Collectors;

public class AssiacaoTesteAI {
    public static void main(String[] args) {
        Local local = new Local("Av. Java, 123");
        Instrutor inst01 = new Instrutor("JOSE MALCHER");
        Seminario seminario = new Seminario("POO com Java", 10, local);

        // adiciona professor ao seminario
        seminario.setIntrutor(inst01);
        inst01.addSeminario(seminario); //bidirecional

        // alunos
        Aluno aluno1 = new Aluno("Maria");
        Aluno aluno2 = new Aluno("JOAO");
        Aluno aluno3 = new Aluno("JOSE");

        seminario.addAluno(aluno1);
        seminario.addAluno(aluno2);
        seminario.addAluno(aluno3);

        // Exibe informações
        System.out.println("Seminário: " + seminario.getTitulo());
        System.out.println("Local: " + seminario.getLocal().getEnredeco());
        System.out.println("Instrutor: " + seminario.getInstrutor().getNome());
        System.out.println("Alunos: " + seminario.getAlunos().stream().map(Aluno::getNome).collect(Collectors.joining(", ")));
    }
}
