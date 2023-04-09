package academy.devdojo.javacore.Zgenerics.testg;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javacore.Zgenerics.domain.Client;
import academy.devdojo.javacore.Zgenerics.domain.Sorterdor;

public class ClientTest01 {
    public static void main(String[] args) {
    String[] clients = {"Joel" , "Jose" , "Santos"};
    List<Client> clients2 = new ArrayList<>();
    clients2.add(new Client("jOE", 154564564));

   var sortear = Sorterdor.sortear(clients);
   System.out.println(sortear);

    
    }
}
