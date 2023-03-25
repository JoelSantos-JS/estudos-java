package academy.devdojo.javacore.Vio.test;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        File file2 = new File("pasta2");
       boolean isDiretorioCriado =  file2.mkdir();
       System.out.println(isDiretorioCriado);
       File fileArquivoDiretorio = new File(file2, "arquivo.txt" );
    }
}
