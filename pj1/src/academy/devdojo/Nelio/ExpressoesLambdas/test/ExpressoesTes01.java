package academy.devdojo.Nelio.ExpressoesLambdas.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.Nelio.Colections.domain.Client;

public class ExpressoesTes01 {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();

        clients.add(new Client("daniel", "Joel tereo@gmail.com"));
        clients.add(new Client("Jose", "djostereo@gmail.com"));
        clients.add(new Client("Mnao", "ajosetereo@gmail.com"));



        Comparator<Client> comparator = (p1 , p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };

        clients.sort(comparator);

        
        for (Client client : clients) {
            System.out.println(client);
        }

    }
}
