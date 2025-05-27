package app;

import dominio.Moeda;

import java.util.Optional;

public class TesteBuscaMoeda {
    public static void main(String[] args) {

        String codigo = "EUR";

        Moeda euro = Moeda.getByCodigoISO(codigo);
        System.out.println(("Moeda encontrada: " + euro + ", Símbolo: " + euro.getSimbolo()));


        Optional<Moeda> ieneOpt = Moeda.findByCodigoISO("JPY");
        ieneOpt.ifPresent(moeda -> System.out.println("Moeda (Optional): " + moeda.getNome()));

        Optional<Moeda> inexistenteOpt = Moeda.findByCodigoISO("XYZ");
        if (!inexistenteOpt.isPresent()) {
            System.out.println("Moeda XYZ não encontrada via Optional.");
            // Saída: Moeda XYZ não encontrada via Optional.
        }

        try {
            Moeda.getByCodigoISO("ABC");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            // Saída: Código ISO de moeda inválido: ABC
        }
    }
}
