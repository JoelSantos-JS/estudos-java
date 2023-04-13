package academy.devdojo.Nelio.ExpressoesLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressoesTest03 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(50);

        List<Integer> list2 =  list.stream().map( x -> x * 50).collect(Collectors.toList());
        var list3 = list.stream().reduce(0 , (x, y) ->   x + y);

        System.out.println(list3);

        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }
}
