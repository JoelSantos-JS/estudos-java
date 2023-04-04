package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import academy.devdojo.javacore.Ycolecoes.domain.Aula2;

public class Testaula {
    public static void main(String[] args) {
        Aula2 aula2 = new Aula2("Noel TI", 20);
        Aula2 aula3 = new Aula2("Mano", 10);
        Aula2 aula4 = new Aula2("Jano", 12);
        Aula2 aula5 = new Aula2("ano", 15);

        ArrayList<Aula2> aulas = new ArrayList<>();
        aulas.add(aula3);
        aulas.add(aula2);
        aulas.add(aula4);
        aulas.add(aula5);

        Collections.sort(aulas, Comparator.comparing(Aula2::getTempo));
        System.out.println(aulas);
        
    }
}
