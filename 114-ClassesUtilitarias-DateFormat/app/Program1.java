package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program1 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        //Criando formatadores para cada estilo
        DateFormat[] formatters = new DateFormat[4];
        formatters[0] = DateFormat.getDateInstance(DateFormat.SHORT);
        formatters[1] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        formatters[2] = DateFormat.getDateInstance(DateFormat.LONG);
        formatters[3] = DateFormat.getDateInstance(DateFormat.FULL);

        System.out.println("-----------------");
        for (DateFormat dateFormat : formatters) {
            System.out.println(dateFormat.format(date));

        }
        System.out.println("-------------------");

        String pattern = "dd/MM/yyyy HH:mm:ss 'BRT'";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Date now = new Date();
        String formattedDate = sdf.format(now);

        System.out.println("Data formatada com padrão customizado:");
        System.out.println(formattedDate);

        System.out.println("---------------------");

        String dateStr = "25/12/2025 10:30:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try {
            Date parsedDate = sdf2.parse(dateStr);
            System.out.println("String original: " + dateStr);
            System.out.println("Objeto Date gerado: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Erro ao fazer o parse da data!");
            e.printStackTrace();
        }
    }
}
