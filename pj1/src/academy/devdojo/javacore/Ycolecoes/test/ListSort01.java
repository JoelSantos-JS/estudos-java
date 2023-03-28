package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("berserk");
        list.add("naruto");
        list.add("dbz");
        Collections.sort(list);
        for (String string : list) {
                System.out.println(string);
        }   
    }
}
