package app;

import java.time.LocalTime;

public class Program {
    public static void main(String[] args) {
        LocalTime agora1 = LocalTime.now();
        System.out.println("Agora é: " + agora1);

        // Criando uma hora com hora e minuto
        LocalTime almoco = LocalTime.of(12, 30);
        System.out.println("Hora do almoço: " + almoco);

// Criando com hora, minuto e segundo
        LocalTime inicioFilme = LocalTime.of(20, 0, 0);
        System.out.println("Início do filme: " + inicioFilme);

// Criando com precisão de nanossegundos
        LocalTime largada = LocalTime.of(9, 5, 10, 123456789);
        System.out.println("Largada da corrida: " + largada);

        LocalTime horaParse = LocalTime.parse("23:59:59");
        System.out.println("Hora parseada: " + horaParse);

        LocalTime agora = LocalTime.now();

        int hora = agora.getHour();
        int minuto = agora.getMinute();
        int segundo = agora.getSecond();
        int nano = agora.getNano(); // Nanossegundo daquele segundo

        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Segundo: " + segundo);
        System.out.println("Nanossegundo: " + nano);


        LocalTime hora1 = LocalTime.of(10, 30, 0);

        System.out.println("Hora original: " + hora1);

// Adicionando e subtraindo
        LocalTime horaMaisTarde = hora1.plusHours(2).plusMinutes(15);
        System.out.println("Hora mais tarde: " + horaMaisTarde);

        LocalTime horaMaisCedo = hora1.minusSeconds(45);
        System.out.println("Hora mais cedo: " + horaMaisCedo);

// Verificando o máximo e mínimo
        System.out.println("Meia-noite: " + LocalTime.MIDNIGHT); // 00:00
        System.out.println("Máxima hora: " + LocalTime.MAX); // 23:59:59.999999999
    }
}
