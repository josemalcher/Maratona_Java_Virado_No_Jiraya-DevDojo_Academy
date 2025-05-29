package app;

import dominio.DataBaseLoader;
import dominio.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();


    }
}
