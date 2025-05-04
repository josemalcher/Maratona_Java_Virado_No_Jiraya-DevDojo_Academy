import entities.Aluno;
import entities.Turma;

public class AppBiDirecionalTurmaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jose");
        Aluno aluno2 = new Aluno("Adriana");
        Aluno aluno3 = new Aluno("Luciana");
        Aluno aluno4 = new Aluno("Lurdes");

        Turma turma01 = new Turma("01");

        turma01.adicionarAluno(aluno1);
        turma01.adicionarAluno(aluno2);

        turma01.listarAlunos();
        System.out.println();

        aluno1.mostrarTurma();
        System.out.println();
    }
}
