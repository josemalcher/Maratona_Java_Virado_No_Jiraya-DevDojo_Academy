package app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Program {
    public static void main(String[] args) {
//        LocalDate hoje = LocalDate.now();
//        LocalDate proximoMes = hoje.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate agora = LocalDate.now();
        System.out.println("Data de hoje: " + agora);
        System.out.println("Dia da semana: " + agora.getDayOfWeek());

        System.out.println("\n--- Ajustes Comuns ---");

        // Próxima terça-feira (não inclui hoje se hoje for terça)
        LocalDate proximaTerca = agora.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Próxima terça-feira: " + proximaTerca);

        // Próxima terça-feira (inclui hoje se hoje for terça)
        LocalDate proximaOuAtualTerca = agora.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println("Próxima ou atual terça-feira: " + proximaOuAtualTerca);

        // Terça-feira anterior
        LocalDate tercaAnterior = agora.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println("Terça-feira anterior: " + tercaAnterior);

        // Primeiro dia do mês
        LocalDate primeiroDiaDoMes = agora.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro dia do mês: " + primeiroDiaDoMes);

        // Último dia do mês
        LocalDate ultimoDiaDoMes = agora.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia do mês: " + ultimoDiaDoMes);

        // Primeiro dia do próximo ano
        LocalDate primeiroDiaProximoAno = agora.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Primeiro dia do próximo ano: " + primeiroDiaProximoAno);
    }
}
