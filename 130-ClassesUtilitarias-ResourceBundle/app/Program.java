package app;

import java.util.Locale;
import java.util.ResourceBundle;

public class Program {
    public static void main(String[] args) {
        System.out.println("Executando com o Locale padrão da JVM...");
        ResourceBundle bundleDefault = ResourceBundle.getBundle("messages");
        System.out.println(bundleDefault.getString("hello"));

        System.out.println("\n--- Mudando o Locale para pt-BR ---");
        Locale localeBR = new Locale("pt", "BR");
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", localeBR);
        System.out.println(bundleBR.getString("hello"));
        System.out.println(bundleBR.getString("good.morning"));

        System.out.println("\n--- Mudando o Locale para en-US ---");
        Locale localeUS = new Locale("en", "US");
        ResourceBundle bundleUS = ResourceBundle.getBundle("messages", localeUS);
        System.out.println(bundleUS.getString("hello")); // Pega o "Howdy" específico do en_US

        System.out.println("-------------");

        Locale localeBR2 = new Locale("pt", "BR");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", localeBR2);

        // Esta chave existe em messages_pt_BR.properties
        System.out.println(bundle.getString("hello")); // Imprime "Olá"

        // Esta chave NÃO existe em messages_pt_BR, então ele busca no arquivo padrão (messages.properties)
        System.out.println(bundle.getString("good.afternoon")); // Imprime "Good afternoon"
    }
}
