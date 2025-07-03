package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Program {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e hora atuais: " + agora);
        // Data e hora atuais: 2025-07-03T20:52:20.793268400

        // Criando a partir de valores primitivos
        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2025, Month.DECEMBER, 25, 10, 30, 0);
        System.out.println("Data e hora específicas: " + dataHoraEspecifica);
        // Data e hora específicas: 2025-12-25T10:30

        // Criando a partir de objetos LocalDate e LocalTime (forma muito comum)
        LocalDate data = LocalDate.of(2026, Month.JANUARY, 1);
        LocalTime hora = LocalTime.of(0, 0, 0);
        LocalDateTime anoNovo = LocalDateTime.of(data, hora);
        System.out.println("Ano Novo 2026: " + anoNovo);
        // Ano Novo 2026: 2026-01-01T00:00

        LocalDateTime dataParse = LocalDateTime.parse("2025-08-15T14:00:00");
        System.out.println("Data e hora parseadas: " + dataParse);
        // Data e hora parseadas: 2025-08-15T14:00

        LocalDateTime evento = LocalDateTime.of(2025, 10, 20, 19, 0);
        System.out.println("Evento original: " + evento);
        // Evento original: 2025-10-20T19:00

        // Adicionando 3 dias e subtraindo 2 horas
        LocalDateTime eventoAjustado = evento.plusDays(3).minusHours(2);
        System.out.println("Evento ajustado: " + eventoAjustado);
        // Evento ajustado: 2025-10-23T17:00

        // Extraindo as partes LocalDate e LocalTime
        LocalDate dataDoEvento = evento.toLocalDate();
        LocalTime horaDoEvento = evento.toLocalTime();

        System.out.println("Apenas a data do evento: " + dataDoEvento);
        // Apenas a data do evento: 2025-10-20
        System.out.println("Apenas a hora do evento: " + horaDoEvento);
        // Apenas a hora do evento: 19:00

        // Combinando de volta com o método 'atTime'
        LocalDateTime eventoRecriado = dataDoEvento.atTime(20, 30, 0);
        System.out.println("Evento recriado para outro horário: " + eventoRecriado);
        // Evento recriado para outro horário: 2025-10-20T20:30
    }
}
