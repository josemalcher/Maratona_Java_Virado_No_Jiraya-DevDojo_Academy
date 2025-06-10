package entities;

public class Computador extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }



    /**
     * @return
     */
    @Override
    public double calcularImposto() {
        System.out.println("CALCULANDO IMPOSTO DO COMPUTADOR");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
