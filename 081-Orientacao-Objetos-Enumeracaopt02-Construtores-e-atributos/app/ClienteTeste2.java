package app;

import dominio.Cliente;
import dominio.TipoCliente;
import dominio.TipoPagamento;

public class ClienteTeste2 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("JOSE", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("JOSE", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
    }
}
