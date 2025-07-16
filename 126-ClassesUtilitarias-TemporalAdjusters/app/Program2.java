package app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

// Criando uma classe para nosso ajustador customizado
class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        // Pega o dia da semana do temporal passado como argumento
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int diasParaAdicionar;
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            diasParaAdicionar = 3; // Se for sexta, pula para segunda
        } else if (dayOfWeek == DayOfWeek.SATURDAY) {
            diasParaAdicionar = 2; // Se for sábado, pula para segunda
        } else {
            diasParaAdicionar = 1; // Para os outros dias, apenas adiciona 1
        }
        return temporal.plus(diasParaAdicionar, ChronoUnit.DAYS);
    }
}
public class Program2 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje + " (" + hoje.getDayOfWeek() + ")");

        // Usando nosso ajustador customizado
        LocalDate proximoDiaUtil = hoje.with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil: " + proximoDiaUtil + " (" + proximoDiaUtil.getDayOfWeek() + ")");

        // Testando com uma sexta-feira
        LocalDate sexta = LocalDate.of(2025, 7, 18); // Uma sexta-feira
        System.out.println("\nSexta-feira: " + sexta);
        LocalDate proximoDiaUtilDepoisDeSexta = sexta.with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil depois de sexta: " + proximoDiaUtilDepoisDeSexta);
    }
}
