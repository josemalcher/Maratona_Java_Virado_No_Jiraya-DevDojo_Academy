package app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        // Padrão brasileiro comum
        String pattern = "'Brasil,' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Date now = new Date();
        String formattedDate = sdf.format(now);

        System.out.println("Data formatada com padrão customizado:");
        System.out.println(formattedDate);


    }
}
