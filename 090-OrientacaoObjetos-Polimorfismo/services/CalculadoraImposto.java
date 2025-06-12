package services;

import entities.Computador;
import entities.Produto;
import entities.Tomate;

public class CalculadoraImposto {
/*
    public static void calculaImpostoComputdor(Computador computador) {
        double imposto = computador.calcularImposto();
        System.out.println("RELATORIO de Imposto do computador");
        System.out.println("Nome: " + computador.getNome());
        System.out.println("VALOR: " + computador.getValor());
        System.out.println("Imposto a ser pago" + imposto);
    }

    public static void calculaImpostoTomate(Tomate tomate) {
        double imposto = tomate.calcularImposto();
        System.out.println("RELATORIO de Imposto do computador");
        System.out.println("Nome: " + tomate.getNome());
        System.out.println("VALOR: " + tomate.getValor());
        System.out.println("Imposto a ser pago" + imposto);
    }*/

    public static void CalcularImpost(Produto produto) {

        System.out.println("RELATORIO DE IMPOSTO");
        System.out.println("PRODUTO: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("IMPOSTO A SER PAGO: " + produto.calcularImposto());
        if (produto instanceof Tomate) {
            //Tomate tomate = (Tomate) produto;
            //System.out.println(tomate.getDataValidade());
            System.out.println( ((Tomate) produto).getDataValidade() );
        }


        System.out.println("-------------------------------");
    }
}
