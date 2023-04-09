package academy.devdojo.javacore.Zgenerics.domain;

import java.util.Random;

public class Sorterdor {
    

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
       
    }

    public static <T> T sortear(T[] objetos) {
        if(objetos.length == 0) {
            throw new NullPointerException("o objeto nai pode esta vazio");
        }
        int posicao = RANDOM.nextInt(objetos.length);

        System.out.println(posicao);
        return objetos[posicao];
    }
}
