package academy.devdojo.javacore.Stream.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javacore.Stream.domain.Pessoa;

public class Stream06 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1 , "Joel", "Brasileiro" , 5));
        pessoas.add(new Pessoa(2 , "Jose", "Brasileiro" , 25));
        pessoas.add(new Pessoa(3 , "Marcos", "Brasileiro" , 65));
        pessoas.add(new Pessoa(4 , "Uruguaio", "Uruguais" , 32));



    pessoas.stream().filter(e -> e.getIdade() > 30).map(Pessoa::getIdade).reduce(Integer::sum).ifPresent(System.out::println);
    pessoas.stream().filter(e -> e.getIdade() > 30).map(e -> e.getIdade()).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
