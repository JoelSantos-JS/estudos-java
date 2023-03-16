package academy.devdojo.javacore.Minterface.test;

import academy.devdojo.javacore.Minterface.dominio.DataBase;
import academy.devdojo.javacore.Minterface.dominio.FileLoader;

public class Datalodertest01 {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        FileLoader fileLoader = new FileLoader();
        dataBase.load();
        fileLoader.load();

        dataBase.remove();
        fileLoader.remove();
        dataBase.checkPermission();
        fileLoader.checkPermission();
        dataBase.retrievMaxDataSize();
    }
}
