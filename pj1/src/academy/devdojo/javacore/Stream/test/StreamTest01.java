package academy.devdojo.javacore.Stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Joel" , "Marcos " , "Lula");

         var list2 =   list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());


            System.out.println(list2);


    }
}
