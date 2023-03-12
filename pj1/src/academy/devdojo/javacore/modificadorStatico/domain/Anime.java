package academy.devdojo.javacore.modificadorStatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

  static  {

        episodios = new int[100];
        for (int i =0;  i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        

        for (int i : Anime.episodios) {
            System.out.println(i + "");
        }
    }

}
