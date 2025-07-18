package entities;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ObterProximoDiaUtil implements TemporalAdjuster {
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