package academy.devdojo.Nelio.Colections.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import academy.devdojo.Nelio.Colections.domain.Client;

public class MapTes {
    public static void main(String[] args) {
        
        Map<Set<Client> , String> cookies = new HashMap<>();

      Set<Client>   client = new HashSet<>();
        client.add(new Client("Joel", "Joel Ter"));
        client.add(new Client("Mano", "Joel Ter@gmail"));
        client.add(new Client("Jose", "Joel Ter"));
        cookies.put(client, "Kop");


        System.out.println(cookies);
    }
}
