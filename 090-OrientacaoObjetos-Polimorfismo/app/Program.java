package app;

import entities.Computador;
import entities.Televisao;
import entities.Tomate;
import services.CalculadoraImposto;

public class Program {
    public static void main(String[] args) {
        Computador c1 = new Computador("486", 100.0);
        Tomate tomate1 = new Tomate("Tomate 1", 20.0);

        Televisao tv1 = new Televisao("SAmsung", 1000.0);

        CalculadoraImposto.CalcularImpost(c1);

        CalculadoraImposto.CalcularImpost(tomate1);

        CalculadoraImposto.CalcularImpost(tv1);


    }
}
