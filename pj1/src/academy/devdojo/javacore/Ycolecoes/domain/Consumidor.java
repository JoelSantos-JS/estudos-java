package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String nome;
    public Consumidor( String nome) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Consumidor [id=" + id + ", nome=" + nome + "]";
    }

    

    
}
