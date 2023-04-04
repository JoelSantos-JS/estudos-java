package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest05 {
    public static void main(String[] args) {
        String joel1 = "Joel1";
        String joel2 = "Joel2";
        String joelString = "Joel3";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(joelString);
        aulas.add(joel1);
        aulas.add(joel2);
        System.out.println(aulas);
        Collections.sort(aulas);

        for (String iterable_element : aulas) {
            System.out.println(iterable_element);
        }

        String primeiraAulas = aulas.get(0);

        aulas.forEach(aula -> {System.out.println("+++++1"+aula);});

        System.out.println("*-----"+primeiraAulas);
        System.out.println(aulas);
    }
}
