package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String proffesor;
    private List<Aula2> aula2 = new LinkedList<>();

    

    public Curso(String nome, String proffesor) {
        this.nome = nome;
        this.proffesor = proffesor;
    }
    public String getNome() {
        return nome;
    }
    public String getProffesor() {
        return proffesor;
    }
    public List<Aula2> getAula2() {
        return Collections.unmodifiableList(aula2);
    }

    public void adicionar(Aula2 aula2) {

         this.aula2.add(aula2);
    }

    public int tempoTotal() {
        int tempot = 0;

        for (Aula2 aula22 : aula2) {
            tempot += aula22.getTempo();
        }

        return tempot;
    }
    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", proffesor=" + proffesor + "Tempo Totaal "+ this.tempoTotal()+ "]";
    }

    

    
}
