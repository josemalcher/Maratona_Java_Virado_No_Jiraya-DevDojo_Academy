import entities.Aluno;
import entities.Escola;
import entities.Sala;

public class ProgramAluno {
    public static void main(String[] args) {

        //Criando alunos
        Aluno aluno1 = new Aluno("Jose", 20);
        Aluno aluno2 = new Aluno("Eliseu", 18);

        //criando salas e adicionando alunos
        Sala salaA = new Sala(5);
        salaA.adicionarAluno(aluno1, 0);
        salaA.adicionarAluno(aluno2, 1);

        //listando alunos
        System.out.println("Alunos da Sala A");
        salaA.listarAlunos();

        //criando mais alunos
        Aluno aluno3 = new Aluno("Maria", 15);
        Aluno aluno4 = new Aluno("Caio", 22);

        //criando sala
        Sala salaB = new Sala(2);
        salaB.adicionarAluno(aluno3,0);
        salaB.adicionarAluno(aluno4,1);

        // Criando ESCOLA
        Escola escola = new Escola(2);
        escola.adicionarSala(salaA);
        escola.adicionarSala(salaB);


        //boas práticas
        salaA.adicionarAluno(new Aluno("Fulano",12),2);
        salaA.adicionarAluno(new Aluno("Fulano 2",12),4);

        // salas na escola
        System.out.println();
        System.out.println("Alunos por sala na escola");
        escola.mostrarAlunosPorSala();

        System.out.println();
        System.out.println("Acessando dados via getters (encapsulamento):");
        System.out.println("Nome do primeiro aluno: " + aluno1.getNome());

        System.out.println();
        System.out.println("Tentando adicionar terceira Sala:");
        escola.adicionarSala(new Sala(10));


    }
}
