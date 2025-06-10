package services;

import entities.Computador;
import entities.Tomate;

public class CalculadoraImposto {

    public void calculaImpostoComputdor(Computador computador) {
        double imposto = computador.calcularImposto();
        System.out.println("RELATORIO de Imposto do computador");
        System.out.println("Nome: " + computador.getNome());
        System.out.println("VALOR: " + computador.getValor());
        System.out.println("Imposto a ser pago" + imposto);
    }

    public void calculaImpostoTomate(Tomate tomate) {
        double imposto = tomate.calcularImposto();
        System.out.println("RELATORIO de Imposto do computador");
        System.out.println("Nome: " + tomate.getNome());
        System.out.println("VALOR: " + tomate.getValor());
        System.out.println("Imposto a ser pago" + imposto);
    }
}
