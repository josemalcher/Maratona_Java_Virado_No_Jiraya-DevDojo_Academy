package app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Program {
    public static void main(String[] args) {

        //LocalDate hoje = LocalDate.now();
        //System.out.println("Hoje é: " + hoje); // hoje é: 2025-06-29

        LocalDate natal = LocalDate.of(2025, 12, 25);
        System.out.println("Natal 2025: " + natal);

        // Usando o enum Month para mais clareza
        LocalDate independencia = LocalDate.of(2025, Month.SEPTEMBER, 7);
        System.out.println("Independência: " + independencia);

        LocalDate dataParse = LocalDate.parse("2026-01-20");
        System.out.println("Data parseada: " + dataParse);

        LocalDate hoje = LocalDate.now();

        int ano = hoje.getYear();
        Month mes = hoje.getMonth(); // Retorna o enum Month
        int numeroDoMes = hoje.getMonthValue(); // Retorna o mês como int (1-12)
        int diaDoMes = hoje.getDayOfMonth();
        int diaDoAno = hoje.getDayOfYear();
        DayOfWeek diaDaSemana = hoje.getDayOfWeek(); // Retorna o enum DayOfWeek

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Número do Mês: " + numeroDoMes);
        System.out.println("Dia do Mês: " + diaDoMes);
        System.out.println("Dia do Ano: " + diaDoAno);
        System.out.println("Dia da Semana: " + diaDaSemana);
        System.out.println("É ano bissexto? " + hoje.isLeapYear());


        LocalDate data = LocalDate.of(2025, Month.AUGUST, 15);

        System.out.println("Data original: " + data);

        // Adicionando e subtraindo
        LocalDate dataFutura = data.plusDays(10).plusMonths(2).plusYears(1);
        System.out.println("Data futura: " + dataFutura);

        LocalDate dataPassada = data.minusWeeks(3);
        System.out.println("Data passada: " + dataPassada);

        // Modificando um campo específico com 'with'
        LocalDate mesmaDataOutroAno = data.withYear(2030);
        System.out.println("Mesma data em 2030: " + mesmaDataOutroAno);

    }
}
