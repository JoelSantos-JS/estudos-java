package academy.devdojo.Nelio.Colections.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import academy.devdojo.Nelio.Colections.domain.Client;

public class SetTest02 {
    public static void main(String[] args) {
        Set<Client> set = new TreeSet<>();
        set.add(new Client("HJ", "null"));

      for (Client client : set) {
        System.out.println(client);
      }

        System.out.println(set);
    }
}
