package app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Program {
    public static void main(String[] args) {
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

        System.out.println("--------------------------------");

        // Usando a implementação com lambda
        TemporalAdjuster proximoDiaUtilAdjuster = temporal -> {
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int diasParaAdicionar = (dayOfWeek == DayOfWeek.FRIDAY) ? 3 :
                    (dayOfWeek == DayOfWeek.SATURDAY) ? 2 : 1;
            return temporal.plus(diasParaAdicionar, ChronoUnit.DAYS);
        };

        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje + " (" + hoje.getDayOfWeek() + ")");

        // Usando nosso ajustador customizado (versão lambda)
        LocalDate proximoDiaUtil = hoje.with(proximoDiaUtilAdjuster);
        System.out.println("Próximo dia útil: " + proximoDiaUtil + " (" + proximoDiaUtil.getDayOfWeek() + ")");

        // Testando com uma sexta-feira
        LocalDate sexta = LocalDate.of(2025, 7, 18); // Uma sexta-feira
        System.out.println("\nSexta-feira: " + sexta);
        LocalDate proximoDiaUtilDepoisDeSexta = sexta.with(proximoDiaUtilAdjuster);
        System.out.println("Próximo dia útil depois de sexta: " + proximoDiaUtilDepoisDeSexta);
    }
}
