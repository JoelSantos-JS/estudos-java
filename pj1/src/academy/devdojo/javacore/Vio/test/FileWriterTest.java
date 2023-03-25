package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt"  );
        try(FileWriter fw = new FileWriter(file)) {
                fw.write("Joe é o melhor\n na proxima te pegar");
                fw.flush();
        } catch (IOException e) {
            // TODO: handle exception

            e.printStackTrace();
        }
    }
}
