package academy.devdojo.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("jOEL");
        alunos.add("Son");
        alunos.add("Gabriel");
        System.out.println(alunos.size());
    }
}
