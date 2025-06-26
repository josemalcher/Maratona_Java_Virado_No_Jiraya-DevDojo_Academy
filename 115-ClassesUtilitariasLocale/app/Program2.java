package app;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args) {
        // Use ZonedDateTime para incluir informações de fuso horário
        ZonedDateTime now = ZonedDateTime.now(); // MUDANÇA AQUI
        Locale localeItaly = new Locale("it", "IT");

        // Cria um formatador para um estilo localizado e aplica o Locale
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL)
                .withLocale(localeItaly);

        System.out.println(now.format(formatter)); //mercoledì 25 giugno 2025 22:23:58 Ora standard di Brasilia
    }
}
