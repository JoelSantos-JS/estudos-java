package academy.devdojo.javacore.test;

import academy.devdojo.javacore.dominio.Professor;

public class ProfessorTeste {
public static void main(String[] args) {
    Professor professor = new Professor();

    professor.idade = 35;
    professor.nome = "Lucas";
    professor.sexo = 'M';

    System.out.println();
}    
}
