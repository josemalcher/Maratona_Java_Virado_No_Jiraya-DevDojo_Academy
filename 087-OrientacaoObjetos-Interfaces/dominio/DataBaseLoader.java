package dominio;

public class DataBaseLoader implements DateLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do BD");

    }

    @Override
    public void remove() {
        System.out.println("Removendo do DB");
    }

    public static void retrieveMaxDateSize() {
        System.out.println("DENTRO DO retrieveMaxDateSize() na class DataBaseLoader");
    }
}
