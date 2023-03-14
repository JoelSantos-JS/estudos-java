package academy.devdojo.javacore.Jmodificadorfinal.dominio;

public class Comparador {
    private String nome;

    @Override

    public String toString() {
        return this.nome;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
