package academy.devdojo.Nelio.generics.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalMax<T extends Comparable<T> >  {
    private List<T> list = new ArrayList<>();



    public T max() {
        return Collections.max(list);
    }
 }
