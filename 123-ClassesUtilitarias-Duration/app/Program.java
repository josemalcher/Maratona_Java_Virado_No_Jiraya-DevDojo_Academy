package app;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Program {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime proximoNatal = LocalDateTime.of(2025, 12, 25, 0, 0, 0);

        LocalTime agoraTime = LocalTime.now();
        LocalTime horaDoAlmoco = LocalTime.of(12, 0);

        // Calculando a duração entre duas datas e horas
        Duration duracaoAteNatal = Duration.between(agora, proximoNatal);
        System.out.println("Duração até o próximo Natal: " + duracaoAteNatal);
        System.out.println("Em dias: " + duracaoAteNatal.toDays());
        System.out.println("Em horas: " + duracaoAteNatal.toHours());

        /*
        *   Duração até o próximo Natal: PT4056H39M12.4478618S
            Em dias: 169
            Em horas: 4056
        * */

        // Calculando a duração entre duas horas
        Duration duracaoAteAlmoco = Duration.between(agoraTime, horaDoAlmoco);
        System.out.println("\nDuração até o almoço: " + duracaoAteAlmoco);
        System.out.println("Em minutos: " + duracaoAteAlmoco.toMinutes());
        /*
        Duração até o almoço: PT-11H-20M-47.5521382S
        Em minutos: -680
        **/

        Duration duracaoDe2Dias = Duration.ofDays(2); // 48 horas
        Duration duracaoDe10Horas = Duration.ofHours(10);
        Duration duracaoDe5Minutos = Duration.ofMinutes(5);

        System.out.println("2 dias em horas: " + duracaoDe2Dias.toHours()); // 2 dias em horas: 48
        System.out.println("10 horas em minutos: " + duracaoDe10Horas.toMinutes()); // 10 horas em minutos: 600

    }
}
