package net.josemalcher.javacore.introducaometodos.test;

import net.josemalcher.javacore.introducaometodos.dominio.ProdutoEx1;

public class ProdutoTestEx1 {
    public static void main(String[] args) {

        ProdutoEx1 produtoEx1 = new ProdutoEx1();
        produtoEx1.setNome("Notebook");
        produtoEx1.setPreco(3000);

        System.out.println("Produto " + produtoEx1.getNome());
        System.out.println("Preço " + produtoEx1.getPreco());

    }
}
