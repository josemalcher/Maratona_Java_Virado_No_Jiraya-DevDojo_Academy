package app;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class ProgramBigDecial {
    public static void main(String[] args) {
        BigDecimal preco = new BigDecimal("199.99");
        BigDecimal quantidade = new BigDecimal("3");
        BigDecimal total = preco.multiply(quantidade); // Cálculo exato

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(nf.format(total)); // Exibe "R$ 599,97"
    }
}
