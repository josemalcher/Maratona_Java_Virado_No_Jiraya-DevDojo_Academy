package dominio;

public enum TipoPagamentoTeste {

    BOLETO(1, "Boleto Bancario"),
    CARTAO_CREDITO(2, "Cartão de Crédito"),
    PIX(3, "Pagamento Instantâneo (PIX)"),
    TRANSFERENCIA(4, "Transferência Bancária");

    private final int codigo;
    private final String descricao;

    TipoPagamentoTeste(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    // Método estático para buscar por código

    public static TipoPagamentoTeste getByCOdigo(int codigo) {
        for (TipoPagamentoTeste tipo : values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de tipo de pagamento inválido");
        //return null;
    }

    @Override
    public String toString() {
        return "TipoPagamentoTeste{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
