package academy.devdojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file);  BufferedWriter br = new BufferedWriter(fw)) {
           fw.write("O devdojo é lindo  é o melhor");
           fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
