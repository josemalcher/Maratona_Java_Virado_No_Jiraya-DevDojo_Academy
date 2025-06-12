package app;

import entities.Computador;
import entities.Televisao;
import entities.Tomate;
import services.CalculadoraImposto;

public class Program {
    public static void main(String[] args) {
        Computador c1 = new Computador("486", 100.0);
        CalculadoraImposto.CalcularImpost(c1);

        Televisao tv1 = new Televisao("SAmsung", 1000.0);
        CalculadoraImposto.CalcularImpost(tv1);


        Tomate tomate1 = new Tomate("Tomate 1", 20.0);
        tomate1.setDataValidade("10/10/2027"); ;
        CalculadoraImposto.CalcularImpost(tomate1);


    }
}
