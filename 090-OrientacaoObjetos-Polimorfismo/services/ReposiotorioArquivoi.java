package services;

import repository.Repositorio;

public class ReposiotorioArquivoi implements Repositorio {
    /**
     *
     */
    @Override
    public void salvar() {
        System.out.println( "Sando em  um ARQUIVO");
    }
}
