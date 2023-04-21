package academy.devdojo.javacore.Stream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import academy.devdojo.javacore.Threads.domain.Pessoa;

public class StreamTest03 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1 , "Joel", "Brasileiro" , 5));
        pessoas.add(new Pessoa(2 , "Jose", "Brasileiro" , 25));
        pessoas.add(new Pessoa(3 , "Marcos", "Brasileiro" , 65));
        pessoas.add(new Pessoa(4 , "Uruguaio", "Uruguais" , 32));


       // pessoas.stream().forEach(e -> System.out.println(e.getNome()));
        pessoas.stream().filter(e -> e.getNacionalidade().equals("Brasileiro")).forEach(e ->  System.out.println(e.getNome()));
        pessoas.stream().filter(e -> e.getNome().equals("Joel")).map(Pessoa::getIdade).forEach(e -> System.out.println(e));

        List<Integer> idades = new ArrayList<>();

        pessoas.stream().forEach(e -> idades.add(e.getIdade()));

      
       List<Pessoa> pessoas2 = pessoas.stream().filter(e -> e.getIdade() > 25).sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());

    int pessoa3=   pessoas.stream().mapToInt(Pessoa::getIdade).reduce(0, Integer::sum);


      System.out.println(pessoa3);
        //System.out.println(pessoas2);
    }
}
