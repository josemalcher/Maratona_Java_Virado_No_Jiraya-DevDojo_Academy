package app;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        // Definindo locales para diferentes regiões
        Locale localeItaly = new Locale("it", "IT"); // Italiano da Itália
        Locale localeSwitzerland = new Locale("it", "CH"); // Italiano da Suíça
        Locale localeIndia = new Locale("hi", "IN"); // Hindi da Índia
        Locale localeJapan = new Locale("ja"); // Japonês

        // Pegando a data atual
        Calendar c = Calendar.getInstance();

        // Criando formatadores para cada locale com o estilo FULL
        DateFormat dfItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dfSwitzerland = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat dfIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("--- Formatando a mesma data para diferentes Locales ---");

        System.out.println("Itália: " + dfItaly.format(c.getTime()));
        System.out.println("Suíça (italiano): " + dfSwitzerland.format(c.getTime()));
        System.out.println("Índia (hindi): " + dfIndia.format(c.getTime()));
        System.out.println("Japão: " + dfJapan.format(c.getTime()));

        // Exemplo de como obter a língua e o país de um locale
        System.out.println("\nLíngua de exibição para pt-BR: " + localeItaly.getDisplayLanguage(new Locale("pt", "BR")));

    }
}
