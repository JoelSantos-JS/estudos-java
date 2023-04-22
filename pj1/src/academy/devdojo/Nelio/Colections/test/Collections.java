package academy.devdojo.Nelio.Colections.test;

import java.util.List;

import academy.devdojo.Nelio.Colections.domain.Client;
import academy.devdojo.livro.Projeto.domain.Product;

public class Collections {
    public static void main(String[] args) {
        Client client = new Client("Joel", "Joeltere9@gmail.com");
        Client client2 = new Client("Joel", "Joeltere9@gmail.com");


        System.out.println(client.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client.equals(client2));
        System.out.println(client == client2);
    }

    public static List<Product> unmodifiableList(List<Product> products) {
        return null;
    }
}
