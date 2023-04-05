package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Aluno;
import academy.devdojo.javacore.Ycolecoes.domain.Aula2;
import academy.devdojo.javacore.Ycolecoes.domain.Curso;

public class TestaBusca {
public static void main(String[] args) {
    Curso curso = new Curso("Domindo", "Joel");
    Aula2 aula2 = new Aula2("SOBRE ARRAYLIST", 60);
   
   //curso.getAula2().add(new Aula2("Joel", 40));
       
   curso.adicionar(aula2);
   curso.adicionar(new Aula2("Mna", 0));
   curso.adicionar(new Aula2("Como ganhar dinheiro", 2));
   curso.adicionar(new Aula2("Mna", 0));

   
   
curso.matricula(new Aluno("Joel", 5500));
curso.matricula(new Aluno("Joel5", 550055));
curso.matricula(new Aluno("Joel5", 5505));

Aluno aluno = curso.buscarMatricula(5505);
  
System.out.println("ALI"+ aluno);
}
}
