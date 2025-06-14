package entities;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
}
