package academy.devdojo.Nelio.generics.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalMax    {
    



    public static <T extends Comparable<T>> T max(List<T> list) {
        if(list.isEmpty()) {
            throw new Error("Lista vazia");

        }

        T max = list.get(0);

        for (T t : list) {
            if(t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
 }
