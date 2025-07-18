package app;

import java.time.*;

public class Program {
    public static void main(String[] args) {
        // Imprime todos os ZoneIds disponíveis
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }

        // Obtendo o ZoneId do sistema e um específico
        ZoneId systemDefaultZone = ZoneId.systemDefault();
        ZoneId saoPauloZone = ZoneId.of("America/Sao_Paulo");
        System.out.println("Fuso horário do sistema: " + systemDefaultZone);
        System.out.println("Fuso horário de São Paulo: " + saoPauloZone);

        // Criando um ZoneOffset
        ZoneOffset offsetMinus3 = ZoneOffset.of("-03:00");
        System.out.println("Offset de -3 horas: " + offsetMinus3);

        System.out.println("-----------------");

        // Criando a partir da data/hora atual com o fuso do sistema
        ZonedDateTime agoraComZona = ZonedDateTime.now();
        System.out.println("Agora com zona: " + agoraComZona);

        // Criando a partir de um LocalDateTime e um ZoneId
        LocalDateTime dataHoraLocal = LocalDateTime.parse("2025-08-20T10:00:00");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime emToquio = ZonedDateTime.of(dataHoraLocal, tokyoZone);
        // OU
        // ZonedDateTime emToquio = dataHoraLocal.atZone(tokyoZone);
        System.out.println("10h da manhã em Tóquio: " + emToquio);

        System.out.println("-----------------");

// Exemplo hipotético de mudança de horário de verão no Brasil
// Suponha que em 19/10/2025 à 00:00, o relógio adianta para 01:00.
        LocalDateTime dataLocal = LocalDateTime.of(2025, 10, 19, 0, 0);
        ZoneId saoPauloZone2 = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime inicioHorarioVerao = dataLocal.atZone(saoPauloZone2);
        System.out.println("Antes da mudança: " + inicioHorarioVerao);

// Adicionando 1 hora
        ZonedDateTime umaHoraDepois = inicioHorarioVerao.plusHours(1);
        System.out.println("Uma hora depois: " + umaHoraDepois);
// Note que o offset mudou de -03:00 para -02:00


        LocalDateTime dataLocal2 = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.of("-05:00");

        OffsetDateTime odt = OffsetDateTime.of(dataLocal2, offset);
        System.out.println("Data com offset: " + odt);
    }
}
