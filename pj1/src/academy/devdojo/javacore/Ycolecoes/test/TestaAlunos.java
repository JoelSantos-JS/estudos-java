package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("joel");
        alunos.add("Son");
        alunos.add("Gabriel");

        List<String> alunosLista = new LinkedList<>(alunos);

        Collections.sort(alunosLista);
        System.out.println(alunosLista.get(2));
    }
}
