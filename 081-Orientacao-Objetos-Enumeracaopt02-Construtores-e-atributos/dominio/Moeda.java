package dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Moeda {
    BRL("BRL", "Real Brasileiro", "R$"),
    USD("USD", "Dólar Americano", "$"),
    EUR("EUR", "Euro", "€"),
    GBP("GBP", "Libra Esterlina", "£"),
    JPY("JPY", "Iene Japonês", "¥"),
    ;
    // ... imagine muitas outras moedas

    private final String codigoISO;
    private final String nome;
    private final String simbolo;

    Moeda(String codigoISO, String nome, String simbolo) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.simbolo = simbolo;
    }


    // Mapa estático para lookup rápido pelo códigoISO
    private static final Map<String, Moeda> lookupPorCodigoISO = new HashMap<>();

    //bloco estático para popular o mapa quando o ENUM é carregado
    static {
        for (Moeda m : values()) {
            lookupPorCodigoISO.put(m.codigoISO, m);
        }
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    // Método de busca usando o Map (O(1) em média)

    // Método de busca usando o Map (O(1) em média)
    public static Moeda getByCodigoISO(String codigoISO) {
        Moeda moeda = lookupPorCodigoISO.get(codigoISO.toUpperCase());
        if (moeda == null) {
            throw new IllegalArgumentException("Código ISO de moeda inválido: " + codigoISO);
        }
        return moeda;
    }

    // Alternativa usando Optional para evitar exceções ou null
    public static Optional<Moeda> findByCodigoISO(String codigoISO) {
        return Optional.ofNullable(lookupPorCodigoISO.get(codigoISO.toUpperCase()));
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "codigoISO='" + codigoISO + '\'' +
                ", nome='" + nome + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
