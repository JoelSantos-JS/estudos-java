package academy.devdojo.javacore.Zgenerics.testg;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        // TODO Auto-generated method stub
            System.out.println("J");
    }
    
}
class Gato extends Animal {
    private String nome;
    public Gato(String nome) {
        this.nome = nome;
    }   

    @Override
    public void consulta() {
        // TODO Auto-generated method stub
            System.out.println("J GATO");
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + "]";
    }

    
    
}

public class WildCard01 {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        gatos.add( new Gato("Joel"));
        for (Gato gato : gatos) {
            System.out.println(gato);
        }
    }
}
