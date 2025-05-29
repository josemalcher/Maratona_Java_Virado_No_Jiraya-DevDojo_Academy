package app;

import dominio.Desenvolvedor;
import dominio.Funcionario;
import dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Funcionario funcionario = new Funcionario("NAMI", 2000);
        Gerente gerente = new Gerente("JOSE", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("JOSE MALCHER", 12000);
        // System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
