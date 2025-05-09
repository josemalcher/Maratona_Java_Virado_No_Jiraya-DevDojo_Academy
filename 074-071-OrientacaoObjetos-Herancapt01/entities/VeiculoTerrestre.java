package entities;

public class VeiculoTerrestre extends Veiculo {

    private int rodas;

    public VeiculoTerrestre(String marca, int rodas) {
        super(marca);
        this.rodas = rodas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
