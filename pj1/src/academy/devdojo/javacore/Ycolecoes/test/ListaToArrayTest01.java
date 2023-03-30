package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaToArrayTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
        Integer[] integers = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        Integer[] integers2 = new Integer[3];
        integers2[0] = 1;
        integers2[1] = 2;
        integers2[2]  = 3;

        List<Integer> nIntegers = new ArrayList<>(Arrays.asList(integers2));
        nIntegers.set(0, 12);
        System.out.println(Arrays.toString(integers2));
        System.out.println(nIntegers);
    }
}
