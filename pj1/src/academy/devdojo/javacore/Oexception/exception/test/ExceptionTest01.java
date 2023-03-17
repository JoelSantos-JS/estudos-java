package academy.devdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\texte.txt");

        try {
          boolean criado =   file.createNewFile();

          System.out.println(" Criando" + criado);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
