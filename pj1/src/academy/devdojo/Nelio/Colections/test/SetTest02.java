package academy.devdojo.Nelio.Colections.test;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest02 {
    public static void main(String[] args) {
        Collection<String> set = new LinkedHashSet<>();
        set.add("Joel");
        set.add("Mano");
        set.add("nul");

        for (String string : set) {
            System.out.println(string);
        }

        System.out.println(set);
    }
}
