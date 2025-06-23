package app;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Cria um objeto Date representando o instante ATUAL
        Date date = new Date(); // aloca um objeto com a data e hora correntes

        // Imprime o objeto Date. O método toString() formata a saída.
        System.out.println(date);
        // Exemplo de saída: Sun Jun 22 23:11:08 GMT-03:00 2025

        // Imprime os milissegundos desde a Época Unix
        System.out.println("Milliseconds since epoch: " + date.getTime());
        // Milliseconds since epoch: 1750644668276

        System.out.println("--------------------");

        // Suponha que este 'legacyDate' veio de uma API antiga
        Date legacyDate = new Date();

// 1. Converta o Date para um Instant
        Instant instant = legacyDate.toInstant();

// 2. Converta o Instant para um LocalDateTime no fuso horário do sistema
        LocalDateTime modernDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println("Data Legada: " + legacyDate);
        System.out.println("Data Moderna: " + modernDate);

    }
}
