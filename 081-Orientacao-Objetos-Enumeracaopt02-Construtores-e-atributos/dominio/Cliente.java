package dominio;

public class Cliente {

    public enum TipoPagamento {
        DEBITO,
        CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteValor=" + tipoCliente.getValor() +
                ", tipoClienteNomeRelatorio=" + tipoCliente.getNomeRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
