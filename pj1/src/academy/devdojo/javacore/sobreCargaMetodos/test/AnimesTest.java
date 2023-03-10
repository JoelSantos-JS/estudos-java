package academy.devdojo.javacore.sobreCargaMetodos.test;

import academy.devdojo.javacore.sobreCargaMetodos.dominio.Anime;

public class AnimesTest {
    public static void main(String[] args) {
       Anime anime = new Anime();
       anime.init("naruto", "tv", 15);
       anime.setGenero("Lutas");
       anime.imprime();
    }
}
