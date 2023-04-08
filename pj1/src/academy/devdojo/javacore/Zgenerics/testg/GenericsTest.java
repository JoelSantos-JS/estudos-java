package academy.devdojo.javacore.Zgenerics.testg;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.javacore.Zgenerics.domain.Aluno;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Joel");
        lista.add("lisa");


        for (Object object : lista) {
            if(object instanceof String) {
                System.out.println(object);
            }
        }

            add(lista, new Aluno("Joel", 25) );

            for (Object string : lista) {
                System.out.println(string);
            }
        }
     


       
    

    private static void add(List lista , Aluno aluno) {
          lista.add(aluno);
    }
}
