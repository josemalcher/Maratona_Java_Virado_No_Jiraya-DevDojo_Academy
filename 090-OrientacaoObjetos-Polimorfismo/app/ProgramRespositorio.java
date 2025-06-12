package app;

import repository.Repositorio;
import services.ReposiotorioArquivoi;

public class ProgramRespositorio {
    public static void main(String[] args) {
        Repositorio repositorio = new ReposiotorioArquivoi();
        repositorio.salvar();

    }
}
