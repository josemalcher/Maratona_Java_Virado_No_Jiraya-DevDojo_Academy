package app;

import dominio.TipoPagamentoTeste;

public class TesteBuscaEnum {
    public static void main(String[] args) {

        int codigoRecebido = 3;

        try {
            TipoPagamentoTeste tipo = TipoPagamentoTeste.getByCOdigo(codigoRecebido);
            System.out.println("Código " + codigoRecebido + " corresponde a: " + tipo);
            // Saída: Código 3 corresponde a: Pagamento Instantâneo (PIX)

            TipoPagamentoTeste tipoInexistente = TipoPagamentoTeste.getByCOdigo(99); // Código inválido
            System.out.println(tipoInexistente);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            // Saída: Código de tipo de pagamento inválido: 99
        }
    }
}
