package academy.devdojo.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");

        System.out.println(map);

        for(String key : map.values()) {
         
         
           System.out.println(key);
        }
    }
}
