package academy.devdojo.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.javacore.Ycolecoes.domain.Celular;

class CelularMarcaComparator implements Comparator<Celular> {

    @Override
    public int compare(Celular o1, Celular o2) {
        // TODO Auto-generated method stub
        return o1.getMarca().compareTo(o2.getMarca());
    }
    
}

public class NavigableTest {
    public static void main(String[] args) {
        NavigableSet<Celular> set = new TreeSet<>(new CelularMarcaComparator());
        Celular celular =  new Celular("Joel", "ull");
        set.add(celular);
        System.out.println(set);
    }
}
