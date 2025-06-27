package app;

import java.text.NumberFormat;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        double valor = 123_456.789;

        // Definindo locales para diferentes regiões
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;

        // Criando formatadores para cada locale
        NumberFormat[] formatters = new NumberFormat[4];
        formatters[0] = NumberFormat.getInstance(localeBR);
        formatters[1] = NumberFormat.getInstance(localeJP);
        formatters[2] = NumberFormat.getInstance(localeIT);
        formatters[3] = NumberFormat.getInstance(localeUS);

        System.out.println("--- Formatando Números ---");
        for (NumberFormat nf : formatters) {
            System.out.println(nf.format(valor));
        }

        System.out.println("\n--- Formatando Moedas ---");
        NumberFormat nfCurrencyBR = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat nfCurrencyJP = NumberFormat.getCurrencyInstance(localeJP);
        NumberFormat nfCurrencyIT = NumberFormat.getCurrencyInstance(localeIT);
        NumberFormat nfCurrencyUS = NumberFormat.getCurrencyInstance(localeUS);

        System.out.println("Brasil: " + nfCurrencyBR.format(valor));
        System.out.println("Japão: " + nfCurrencyJP.format(valor));
        System.out.println("Itália: " + nfCurrencyIT.format(valor));
        System.out.println("EUA: " + nfCurrencyUS.format(valor));

        // Configuração adicional: controlar o número de casas decimais
        System.out.println("\n--- Controlando a precisão ---");
        nfCurrencyBR.setMaximumFractionDigits(4);
        System.out.println("Brasil (4 casas decimais): " + nfCurrencyBR.format(valor));
    }
}
