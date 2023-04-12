package academy.devdojo.Nelio.Colections.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        // Lista de objetos estudante
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Ana", 20));
        estudantes.add(new Estudante("Maria", 18));
        estudantes.add(new Estudante("João", 20));
        estudantes.add(new Estudante("Pedro", 18));
        estudantes.add(new Estudante("Luiz", 19));
        estudantes.add(new Estudante("Julia", 20));
        estudantes.add(new Estudante("Renato", 19));
        estudantes.add(new Estudante("Lucas", 18));
        estudantes.add(new Estudante("Mariana", 19));
        
        // Criando um conjunto (Set) de idades únicas dos estudantes
        Set<Integer> idadesUnicas = new HashSet<>();
        for (Estudante estudante : estudantes) {
            
            idadesUnicas.add(estudante.getIdade());
        }


        
        // Criando um mapa (Map) para contar quantos estudantes existem em cada idade
        Map<Integer, Integer> estudantesPorIdade = new HashMap<>();
        for (Integer idade : idadesUnicas) {
            int contador = 0;
            for (Estudante estudante : estudantes) {
                if (estudante.getIdade() == idade) {
                    contador++;
                }
            }
            estudantesPorIdade.put(idade, contador);
        }
        
        // Imprimindo o número de estudantes por idade
        for (Map.Entry<Integer, Integer> entry : estudantesPorIdade.entrySet()) {
            System.out.println("Idade: " + entry.getKey() + " - Número de estudantes: " + entry.getValue());
        }
    }
}

class Estudante {
    private String nome;
    private int idade;
    
    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Estudante [nome=" + nome + ", idade=" + idade + "]";
    }


    
   

}
