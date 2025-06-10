package entities;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.10;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    /**
     * @return
     */
    @Override
    public double calcularImposto() {
        System.out.println("CALCULANDO IMPOSTO DO TOMATE");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
