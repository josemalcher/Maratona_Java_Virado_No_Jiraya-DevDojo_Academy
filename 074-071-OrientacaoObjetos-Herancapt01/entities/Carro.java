package entities;

public class Carro extends VeiculoTerrestre{
    private int portas;

    public Carro(String marca, int rodas, int portas) {
        super(marca, rodas);
        this.portas = portas;
    }

    @Override
    public void ligar() {
        super.ligar();
    }
}
