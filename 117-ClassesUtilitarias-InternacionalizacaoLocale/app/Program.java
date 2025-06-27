package app;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        double valor = 12345.67;

        // Definindo Locales
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeDE = Locale.GERMANY;

        // Criando formatadores de moeda
        NumberFormat nfBR = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(localeUS);
        NumberFormat nfJP = NumberFormat.getCurrencyInstance(localeJP);
        NumberFormat nfDE = NumberFormat.getCurrencyInstance(localeDE);

        System.out.println("--- Formatando o mesmo valor para diferentes moedas ---");
        System.out.println("Brasil: " + nfBR.format(valor));
        System.out.println("EUA: " + nfUS.format(valor));
        System.out.println("Japão: " + nfJP.format(valor)); // Note o arredondamento e a falta de casas decimais
        System.out.println("Alemanha: " + nfDE.format(valor));

        System.out.println("\n--- Inspecionando a Moeda (Classe Currency) ---");

        // Obtendo o objeto Currency a partir do formatador
        Currency currencyUS = nfUS.getCurrency();

        // Obtendo informações do objeto Currency
        System.out.println("Moeda (EUA): " + currencyUS.getDisplayName());
        System.out.println("Código ISO 4217 (EUA): " + currencyUS.getCurrencyCode());
        System.out.println("Símbolo padrão (EUA): " + currencyUS.getSymbol());

        // Opcional: como o símbolo é visto em outro país?
        System.out.println("Símbolo (EUA) visto no Brasil: " + currencyUS.getSymbol(localeBR));
    }
}
