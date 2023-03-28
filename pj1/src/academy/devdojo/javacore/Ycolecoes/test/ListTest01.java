package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

/**
 * ListTest01
 */
public class ListTest01 {

    public static void main(String[] args) {
        List<String> nomes  = new ArrayList();
        nomes.add("Joel");

        for (String string : nomes) {
            System.out.println(string);
        }
    }
}