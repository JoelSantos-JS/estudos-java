package academy.devdojo.Nelio.Colections.test;

import java.util.Map;
import java.util.TreeMap;

public class MapTes {
    public static void main(String[] args) {
        
        Map<String , String> cookies = new TreeMap<>();
        cookies.put("0", "Chocolate" );
        cookies.put("1", "Coco");

        cookies.remove("0");
        System.out.println(cookies);

        for ( String key : cookies.keySet()) {
            System.out.println(key);
        }
    }
}
