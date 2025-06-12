package services;

import repository.Repositorio;

public class RepositorioDB implements Repositorio {

    /**
     *
     */
    @Override
    public void salvar() {
        System.out.println( "Sando no DB");

    }
}
