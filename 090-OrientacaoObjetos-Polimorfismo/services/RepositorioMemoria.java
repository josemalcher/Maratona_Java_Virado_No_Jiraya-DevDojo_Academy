package services;

import repository.Repositorio;

public class RepositorioMemoria implements Repositorio {

    /**
     *
     */
    @Override
    public void salvar() {
        System.out.println( "Sando em  MEMORIA ");
    }
}
