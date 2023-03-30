package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BynarySearchTes {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(0);
        numeros.add(8);
        numeros.add(3);

        Collections.sort(numeros);

        // 0 3 5 8 value
        // 0 1 2 3 index
        var colletion = Collections.binarySearch(numeros, 8 );

        System.out.println(colletion);

    }
}
