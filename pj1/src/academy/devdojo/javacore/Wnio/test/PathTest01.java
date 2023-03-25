package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
       Path pi = Paths.get("file.txt");
       System.out.println(pi.getFileName());
    }
}
