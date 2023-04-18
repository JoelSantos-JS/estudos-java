package academy.devdojo.livro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import academy.devdojo.livro.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        
       List<Carro> carros = new ArrayList<>();
       carros.add(new Carro("Ford", 2018));
       carros.add(new Carro("Ferrari", 2020));
       carros.add(new Carro("Mercedes", 2022));


       Carro carro = new Carro("Ford", 2018);

       carro.ligar();
       carro.acelerar();
       
       Function<Carro, String> function = c -> c.getCor();

       carros.sort(Comparator.comparing(function));


       for (Carro carro1 : carros) {
            System.out.println(carro1);
       }
        
    }
}
