package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate aniversario = LocalDate.of(1990, Month.AUGUST, 15);
        LocalDate hoje = LocalDate.now();

        // Usando Period
        Period periodo = Period.between(aniversario, hoje);
        System.out.println("Periodo (quebrado): " + periodo);

        // Usando ChronoUnit para obter o total em unidades únicas
        System.out.println("\n--- Usando ChronoUnit ---");
        System.out.println("Total de Anos: " + ChronoUnit.YEARS.between(aniversario, hoje));
        System.out.println("Total de Meses: " + ChronoUnit.MONTHS.between(aniversario, hoje));
        System.out.println("Total de Semanas: " + ChronoUnit.WEEKS.between(aniversario, hoje));
        System.out.println("Total de Dias: " + ChronoUnit.DAYS.between(aniversario, hoje));
        System.out.println("----------");
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime proximaSemana = agora.plusWeeks(1);

        System.out.println("Horas até a próxima semana: " + ChronoUnit.HOURS.between(agora, proximaSemana));
        System.out.println("Minutos até a próxima semana: " + ChronoUnit.MINUTES.between(agora, proximaSemana));
    }
}
