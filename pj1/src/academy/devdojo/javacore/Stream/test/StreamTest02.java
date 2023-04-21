package academy.devdojo.javacore.Stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.javacore.Threads.domain.Pessoa;

public class StreamTest02 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1 , "Joel", "Brasileiro" , 5));
        pessoas.add(new Pessoa(2 , "Jose", "Brasileiro" , 25));
        pessoas.add(new Pessoa(3 , "Marcos", "Brasileiro" , 65));


     var filtroPorIdade =   pessoas.stream().filter(e -> e.getIdade() < 20).collect(Collectors.toList());
     var filtroPorNome =  pessoas.stream().filter(e -> e.getNome().equals("Jose")).collect(Collectors.toList());


        System.out.println(filtroPorIdade);
        System.out.println(filtroPorNome);

    }
}
