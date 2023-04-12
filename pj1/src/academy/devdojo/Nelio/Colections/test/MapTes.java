package academy.devdojo.Nelio.Colections.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTes {
    public static void main(String[] args) {
        
        Map<String , String> cookies = new HashMap<>();
        cookies.put("0", "Chocolate" );
        cookies.put("1", "Coco");

        System.out.println(cookies);
        cookies.remove("1");
        cookies.put("5","abacate");
        cookies.put("3","banana");

        System.out.println(cookies);
        for ( String key : cookies.keySet()) {
            System.out.println(key);
        }
    }
}
