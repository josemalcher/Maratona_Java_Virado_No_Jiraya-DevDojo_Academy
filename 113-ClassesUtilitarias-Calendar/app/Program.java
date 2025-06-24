package app;

import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Pega uma instância do calendário padrão (Gregoriano) com a data/hora atual
        Calendar c = Calendar.getInstance();

        // Convertendo um Calendar para um Date
        Date date = c.getTime();
        System.out.println("Data obtida do Calendar: " + date);

        // O Calendar é mutável. Podemos alterar sua data.
        // O mês ainda é problemático: Janeiro = 0, Fevereiro = 1...
        c.set(2025, Calendar.DECEMBER, 25);
        date = c.getTime();
        System.out.println("Data alterada para o Natal: " + date);
        System.out.println("------------");

        int ano = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH); // Lembre-se: 0 = Janeiro
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int diaDaSemana = c.get(Calendar.DAY_OF_WEEK); // 1 = Domingo, 2 = Segunda...

        System.out.println("Ano: " + ano);
        System.out.println("Mês (0-11): " + mes);
        System.out.println("Dia: " + dia);
        System.out.println("Dia da Semana (1-7): " + diaDaSemana);

        System.out.println("--------------");


        System.out.println("Data Original: " + c.getTime());

// Adicionar 10 dias à data atual
        c.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Daqui a 10 dias: " + c.getTime());

// Subtrair 2 meses
        c.add(Calendar.MONTH, -2);
        System.out.println("2 meses atrás: " + c.getTime());

// Adicionar 5 anos
        c.add(Calendar.YEAR, 5);
        System.out.println("Daqui a 5 anos: " + c.getTime());

// O método 'roll' é similar, mas não "vira" unidades maiores.
// Ex: rolar 10 dias em 25/12 não mudaria o mês para janeiro. É menos usado.
    }
}
