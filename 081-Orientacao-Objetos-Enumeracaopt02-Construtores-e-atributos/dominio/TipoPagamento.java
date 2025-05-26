package dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;

        }
    },
    CREDITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.5;
        }
    };
    public abstract double calculaDesconto(double valor) ;
}