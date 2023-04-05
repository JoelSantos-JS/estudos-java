package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.javacore.Ycolecoes.domain.Aula2;
import academy.devdojo.javacore.Ycolecoes.domain.Curso;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Domindo", "Joel");
        Aula2 aula2 = new Aula2("SOBRE ARRAYLIST", 60);
       
       //curso.getAula2().add(new Aula2("Joel", 40));
           
       curso.adicionar(aula2);
       curso.adicionar(new Aula2("Mna", 0));
       curso.adicionar(new Aula2("Como ganhar dinheiro", 2));
       curso.adicionar(new Aula2("Mna", 0));
       System.out.println(curso);
        List<Aula2> aula2Imutaveis = curso.getAula2();
        List<Aula2>  aula2s = new ArrayList<>(aula2Imutaveis);
       Collections.sort(aula2s);



       System.out.println(aula2s);

       System.out.println(curso.tempoTotal());
    }
}
