package net.josemalcher;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = (int) 100000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 200D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32767;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "è um grande texto";

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println("CHar " + caractere);
        System.out.println(numeroGrande);
    }

}
