package academy.devdojo.Nelio.Colections.test;

import academy.devdojo.Nelio.Colections.domain.Client;

public class Collections {
    public static void main(String[] args) {
        Client client = new Client("Joel", "Joeltere9@gmail.com");
        Client client2 = new Client("Joel", "Joeltere9@gmail.com");


        System.out.println(client.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client.equals(client2));
        System.out.println(client == client2);
    }
}
