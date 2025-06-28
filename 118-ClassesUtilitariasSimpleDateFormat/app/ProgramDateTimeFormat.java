package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramDateTimeFormat {
    public static void main(String[] args) {

        // O formatador é imutável e pode ser uma constante estática segura
        final DateTimeFormatter BRAZIL_FORMATTER =
                DateTimeFormatter.ofPattern("'Brasil,' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(BRAZIL_FORMATTER);
        System.out.println(formatted);



    }
}
