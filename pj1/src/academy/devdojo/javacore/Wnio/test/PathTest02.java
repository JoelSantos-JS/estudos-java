package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
   public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if(Files.notExists(pastaPath)){
            Path pastaDirectrory = Files.createDirectory(pastaPath);
        }
        
   }
}
