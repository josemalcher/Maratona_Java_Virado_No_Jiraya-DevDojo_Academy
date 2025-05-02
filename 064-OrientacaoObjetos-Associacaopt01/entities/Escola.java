package entities;

public class Escola {
    private Sala[] salas;
    private int totalSalas;

    public Escola(int maxSalas) {
        this.salas = new Sala[maxSalas];
    }

    public void adicionarSala(Sala sala) {
        if (totalSalas < salas.length) {
            this.salas[totalSalas++] = sala;
        }else{
            System.out.println("Capacidade máxima de salas atingida!!!");
        }
    }

    public void mostrarAlunosPorSala() {
        for (int i = 0; i < this.totalSalas; i++) {
            System.out.println("Sala " + (i + 1) + ":");
            salas[i].listarAlunos();
        }
    }
}
