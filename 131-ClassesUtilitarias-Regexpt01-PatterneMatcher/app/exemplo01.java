package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exemplo01 {
    public static void main(String[] args) {

        String texto = "AB AABB a ba ba ba ba";

        Pattern pattern = Pattern.compile("AB");
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Índices: 0123456789..."); // Para visualização
        System.out.println("Expressão Regular: AB");
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.println("Posicao - " + matcher.start());
        }
        System.out.println("*****************************");
        String texto2 = "abaaba";
        Pattern pattern2 = Pattern.compile("aba");
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("Texto: " + texto2);
        System.out.println("Expressão Regular: aba");
        System.out.println("Posições encontradas:");

        while (matcher2.find()) {
            System.out.println("Posição: " + matcher2.start());
        }

    }
}
