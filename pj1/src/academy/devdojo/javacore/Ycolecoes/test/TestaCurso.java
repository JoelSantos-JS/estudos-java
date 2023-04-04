package academy.devdojo.javacore.Ycolecoes.test;

import java.util.List;

import academy.devdojo.javacore.Ycolecoes.domain.Aula2;
import academy.devdojo.javacore.Ycolecoes.domain.Curso;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Domindo", "Joel");
        Aula2 aula2 = new Aula2("SOBRE ARRAYLIST", 60);
       
       //curso.getAula2().add(new Aula2("Joel", 40));
        
       curso.adicionar(aula2);

       System.out.println(curso.getAula2());

       System.out.println(aula2 == curso.getAula2());
    }
}
