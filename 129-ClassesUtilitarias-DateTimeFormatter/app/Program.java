package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();

        // Formatando com padrões ISO pré-definidos
        System.out.println("ISO DATE: " + hoje.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO WEEK DATE: " + hoje.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("ISO DATE TIME: " + agora.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("-----------------");


        // Criando um formatador com um padrão brasileiro
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime agora2 = LocalDateTime.now();

        String dataFormatada = agora2.format(formatterBR);
        System.out.println("Data formatada para o padrão BR: " + dataFormatada);

        System.out.println("-----------------");

        String dataEmTexto = "25/12/2025 10:30:00";
        DateTimeFormatter parserBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

// Fazendo o parse do texto para um objeto LocalDateTime
        LocalDateTime dataParseada = LocalDateTime.parse(dataEmTexto, parserBR);
        System.out.println("Data parseada: " + dataParseada);


        LocalDateTime agora3 = LocalDateTime.now();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        // Criando formatadores localizados
        DateTimeFormatter formatterBR2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(localeBR);
        DateTimeFormatter formatterJP = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(localeJP);
        DateTimeFormatter formatterIT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(localeIT);

        System.out.println("Brasil: " + agora3.format(formatterBR2));
        System.out.println("Japão: " + agora3.format(formatterJP));
        System.out.println("Itália: " + agora3.format(formatterIT));
    }
}
