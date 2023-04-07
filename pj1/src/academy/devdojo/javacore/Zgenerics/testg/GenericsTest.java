package academy.devdojo.javacore.Zgenerics.testg;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        lista.add("Joel");
        lista.add("lisa");
        lista.add(123);

        for (Object object : lista) {
            if(object instanceof Integer) {
                System.out.println(object);
            }
        }
    }
}
