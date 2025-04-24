package net.josemalcher.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-1);
    }
    public void multiplicaDoisNumeros(int a, int b){
        System.out.println(a*b);
    }
    public double divideDoisNumeros(int a, int b){
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
