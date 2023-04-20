package academy.devdojo.javacore.Stream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.javacore.Stream.domain.Pessoa;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1 , "Joel", "Brasileiro" , 5));
        pessoas.add(new Pessoa(2 , "Jose", "Brasileiro" , 25));
        pessoas.add(new Pessoa(3 , "Marcos", "Brasileiro" , 65));


        System.out.println(pessoas.stream().count());

        pessoas.stream().max(Comparator.comparing(Pessoa::getIdade)).ifPresent(System.out::println);

      DoubleSummaryStatistics statistics =   pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getIdade));
        
    String steam=  pessoas.stream().map(e -> e.getNome()).collect(Collectors.joining(", "));
      System.out.println(statistics);

      System.out.println(steam);
    }
}
