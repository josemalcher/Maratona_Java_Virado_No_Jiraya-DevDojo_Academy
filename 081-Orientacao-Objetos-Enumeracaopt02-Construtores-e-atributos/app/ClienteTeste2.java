package app;

import dominio.Cliente;
import dominio.TipoCliente;

public class ClienteTeste2 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("JOSE", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("JOSE", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
