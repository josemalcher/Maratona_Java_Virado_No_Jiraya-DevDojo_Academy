package app;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        Instant agora1 = Instant.now();
        System.out.println("Instante atual (UTC): " + agora1);
        // Exemplo de saída: Instante atual (UTC): 2025-07-08T00:33:47.819117800Z
        // A letra 'Z' no final significa Zulu Time (UTC).

        // Criando a partir de milissegundos (similar a new Date(long))
        Instant deMilis = Instant.ofEpochMilli(1000L);
        System.out.println("1 segundo após a Época: " + deMilis);
        // 1 segundo após a Época: 1970-01-01T00:00:01Z

        // Criando a partir de segundos
        Instant deSegundos = Instant.ofEpochSecond(3600);
        System.out.println("1 hora após a Época: " + deSegundos);
        // 1 hora após a Época: 1970-01-01T01:00:00Z


        Instant agora2 = Instant.now();
        System.out.println("Agora: " + agora2);

        // Adicionando 2 horas
        Instant duasHorasDepois = agora2.plusSeconds(7200);
        System.out.println("Duas horas depois: " + duasHorasDepois);
        // Duas horas depois: 2025-07-08T02:38:28.116353600Z

        // Subtraindo 10 minutos
        Instant dezMinutosAntes = agora2.minusSeconds(600);
        System.out.println("Dez minutos antes: " + dezMinutosAntes);
        // Dez minutos antes: 2025-07-08T00:28:28.116353600Z



        Instant agora = Instant.now();
        System.out.println("Instant (UTC): " + agora);
        // Instant (UTC): 2025-07-08T00:39:30.742537700Z

        // Convertendo o Instant para um LocalDateTime no fuso horário de São Paulo
        LocalDateTime emSaoPaulo = LocalDateTime.ofInstant(agora, ZoneId.of("America/Sao_Paulo"));
        System.out.println("Mesmo instante em São Paulo: " + emSaoPaulo);
        // Mesmo instante em São Paulo: 2025-07-07T21:39:30.742537700

        // Convertendo o Instant para um LocalDateTime no fuso horário de Tóquio
        LocalDateTime emToquio = LocalDateTime.ofInstant(agora, ZoneId.of("Asia/Tokyo"));
        System.out.println("Mesmo instante em Tóquio: " + emToquio);
        // Mesmo instante em Tóquio: 2025-07-08T09:39:30.742537700


    }
}
