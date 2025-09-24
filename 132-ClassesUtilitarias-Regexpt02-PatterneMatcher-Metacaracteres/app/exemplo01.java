package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exemplo01 {
    public static void main(String[] args) {
        String texto = "23 AB 12 c a b 4567 89ab";

        Pattern patternD = Pattern.compile("\\d");
        Matcher matcherD = patternD.matcher(texto);

        System.out.println("Expressão Regular: \\d (Dígitos)");
        while (matcherD.find()) {
            System.out.println("Posição - " + matcherD.start() + " - Valor: " + matcherD.group());
        }

    }
}
