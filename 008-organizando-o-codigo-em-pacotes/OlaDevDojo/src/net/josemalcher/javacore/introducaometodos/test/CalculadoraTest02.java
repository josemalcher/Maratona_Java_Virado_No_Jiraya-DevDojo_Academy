package net.josemalcher.javacore.introducaometodos.test;

import net.josemalcher.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result =  calculadora.divideDoisNumeros(10, 2);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros(100, 0));
    }
}
