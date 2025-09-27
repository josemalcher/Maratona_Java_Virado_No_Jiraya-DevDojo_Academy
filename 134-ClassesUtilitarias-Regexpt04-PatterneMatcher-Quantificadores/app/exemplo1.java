package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exemplo1 {
    public static void main(String[] args) {
        String textoHex = "12 0x 0X 0xFFFC 0X10G 0X1";
        Pattern patternHex = Pattern.compile("0[xX][0-9a-fA-F]+(\\s|$)");
        Matcher matcherHex = patternHex.matcher(textoHex);

        System.out.println("Expressão Regular: 0[xX][0-9a-fA-F]+(\\s|$)");
        while (matcherHex.find()) {
            System.out.println("Posição: " + matcherHex.start() + " - Valor: " + matcherHex.group().trim()); // .trim() para remover o espaço
        }
    }
}
