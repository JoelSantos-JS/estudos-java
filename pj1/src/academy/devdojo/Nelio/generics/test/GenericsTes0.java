package academy.devdojo.Nelio.generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTes0 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(2);
        integers.add(5);
        integers.add(6);
        printList(integers);
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
