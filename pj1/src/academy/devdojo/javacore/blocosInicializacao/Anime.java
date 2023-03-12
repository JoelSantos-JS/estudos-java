package academy.devdojo.javacore.blocosInicializacao;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    public Anime() {
        

        for (int i : this.episodios) {
            System.out.println(i + "");
        }
    }

}
