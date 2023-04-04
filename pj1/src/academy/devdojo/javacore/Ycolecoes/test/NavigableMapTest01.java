package academy.devdojo.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("A","Letra");
        map.put("B","LetraB");
        map.put("C","LetraC");

        for (Entry<String, String>  string : map.entrySet()) {
        System.out.println(string);
        }
    }
}
