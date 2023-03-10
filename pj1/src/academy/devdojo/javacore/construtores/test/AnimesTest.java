package academy.devdojo.javacore.construtores.test;

import academy.devdojo.javacore.construtores.dominio.Anime;

public class AnimesTest {
    public static void main(String[] args) {
       Anime anime = new Anime("Joel");
       anime.init("naruto", "tv", 15);
       anime.setGenero("Lutas");
       anime.imprime();

     
    }
}
