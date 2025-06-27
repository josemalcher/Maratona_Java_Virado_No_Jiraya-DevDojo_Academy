package app;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ProgramParsing {
    public static void main(String[] args) {
        // String formatada no padrão alemão (vírgula como decimal)
        String valorStr = "1.234,56";
        NumberFormat nfDE = NumberFormat.getInstance(Locale.GERMANY);

        try {
            // Usa o formatador alemão para interpretar a string corretamente
            double parsedValue = nfDE.parse(valorStr).doubleValue();
            System.out.println("String original: " + valorStr);
            System.out.println("Valor parseado: " + parsedValue); // 1234.56

            // Tentar fazer o parse com o formatador errado (americano)
            NumberFormat nfUS = NumberFormat.getInstance(Locale.US);
            // Isso interpretará a vírgula como separador de milhar e ignorará o resto.
            System.out.println("Parse com locale US: " + nfUS.parse(valorStr)); // 1234

        } catch (ParseException e) {
            System.out.println("Erro: A string não corresponde ao formato esperado.");
            e.printStackTrace();
        }
    }
}
