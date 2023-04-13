package academy.devdojo.Nelio.ExpressoesLambdas.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.Nelio.Colections.domain.Client;

public class ELambada {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();

        clients.add(new Client("daniel", "Joel tereo@gmail.com"));
        clients.add(new Client("Jose", "djostereo@gmail.com"));
        clients.add(new Client("Mnao", "ajosetereo@gmail.com"));



      
        clients.removeIf(p -> p.getNome() != "Jose");

        

        
        for (Client client : clients) {
            System.out.println(client);
        }

    }
}
