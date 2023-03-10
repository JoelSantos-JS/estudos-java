package academy.devdojo.javacore.sobreCargaMetodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;


    public Anime(){
        
    }

    public void init(String nome , String tipo , int episodios){
        this.nome = nome;
        this.tipo= tipo;
        this.episodios = episodios;
    }

    public void setTipo(String tipo) {
        this.tipo= tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome =nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getEpsodio(){
        return this.episodios;
    }

    public void imprime(){
        System.out.println(this.episodios);
        System.out.println(this.nome);
    }
}
