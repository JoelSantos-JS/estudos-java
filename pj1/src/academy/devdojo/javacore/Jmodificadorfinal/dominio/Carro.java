package academy.devdojo.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double velocidadeLimete; 
    private final Comparador Comprador = new Comparador();

    static {
        velocidadeLimete = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
