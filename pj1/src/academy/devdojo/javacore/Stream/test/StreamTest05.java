package academy.devdojo.javacore.Stream.test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("jOEL", "Marcos", "Luggy", "Naruto");

        List<String> result = words.stream().map(e -> e.split("")).flatMap(Arrays::stream).collect(Collectors.toList());



        System.out.println(result);
  
          }
          
         
}
