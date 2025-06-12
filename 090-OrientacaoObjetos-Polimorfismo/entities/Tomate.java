package entities;

public class Tomate extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.10;

    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
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
