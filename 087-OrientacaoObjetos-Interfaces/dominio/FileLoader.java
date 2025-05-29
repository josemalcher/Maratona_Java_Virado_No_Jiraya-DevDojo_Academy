package dominio;

public class FileLoader implements DateLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("DELETANDO DADOS DE UM ARQUIVO");
    }

    @Override
    public void checkPermission() {
        System.out.println("CHECANDO ARQUIVO...................................OK");
    }
}
