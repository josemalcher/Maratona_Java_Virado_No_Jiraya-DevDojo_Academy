package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program2 {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        String formatado = localDateTime.format(dateTimeFormatter);
        System.out.println("FORMATADO: " + formatado);

        String dateStr = "25/12/2025 10:30:00";
        LocalDateTime parsed = LocalDateTime.parse(dateStr, dateTimeFormatter);
        System.out.println("Parseado: " + parsed);

    }
}
