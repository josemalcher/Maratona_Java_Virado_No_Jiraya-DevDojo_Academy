package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exemplo01 {
    public static void main(String[] args) {
        String texto = "cafeBABE";
        //Pattern pattern = Pattern.compile("[abcABC]"); // Busca 'a', 'b' ou 'c' minúsculos
        Pattern pattern = Pattern.compile("[a-z]"); // Busca qualquer letra minúscula de 'a' a 'z'
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Expressão Regular: [a-z]");
        while (matcher.find()) {
            System.out.println("Posição: " + matcher.start() + " - Valor: " + matcher.group());
        }
    }
}
