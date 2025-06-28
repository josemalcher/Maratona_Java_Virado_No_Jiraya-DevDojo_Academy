package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProgramParsing {
    public static void main(String[] args) {
        String dateStr = "25/12/2025";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Tenta converter a String para um objeto Date
            Date parsedDate = sdf.parse(dateStr);
            System.out.println("String original: " + dateStr);
            System.out.println("Objeto Date gerado: " + parsedDate);

            // Opcional: Re-formatar o Date para outro padrão para confirmar
            SimpleDateFormat sdfOutro = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
            System.out.println("Data re-formatada: " + sdfOutro.format(parsedDate));

        } catch (ParseException e) {
            // Este bloco é executado se a String 'dateStr' não seguir o formato "dd/MM/yyyy"
            System.out.println("Erro: A string não corresponde ao formato esperado.");
            e.printStackTrace();
        }
    }
}
