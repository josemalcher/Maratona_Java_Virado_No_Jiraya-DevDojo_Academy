package app;

import entities.Computador;
import entities.Tomate;
import services.CalculadoraImposto;

public class Program {
    public static void main(String[] args) {
        Computador c1 = new Computador("486", 100.0);
        Tomate tomate1 = new Tomate("Tomate 1", 20.0);

        CalculadoraImposto.calculaImpostoComputdor(c1);
        CalculadoraImposto.calculaImpostoTomate(tomate1);

    }
}
