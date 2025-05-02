import entities.Aluno;
import entities.Departamento;
import entities.Professor;

public class ProgramEscola1 {
    public static void main(String[] args) {
        //criando alunos
        Aluno aluno1 = new Aluno("Jose");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Luciana");
        Aluno aluno4 = new Aluno("Caio");

        //professor -> alunos
        Professor prof1 = new Professor("Mc. Adriana");
        prof1.adicionaAluno(aluno1);
        prof1.adicionaAluno(aluno2);

        Professor prof2 = new Professor("Mc. Malcher");
        prof2.adicionaAluno(aluno3);
        prof2.adicionaAluno(aluno4);

        Departamento departamento = new Departamento("Analise e Dese. de Sistemas");
        departamento.adicionaProfessor(prof1);
        departamento.adicionaProfessor(prof2);

        departamento.relatorio();
    }
}
