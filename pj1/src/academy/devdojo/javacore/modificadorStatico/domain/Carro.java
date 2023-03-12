package academy.devdojo.javacore.modificadorStatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimete  = 250;


    
    public Carro(String nome , double velocidadeMaxima  ) {
        this.nome = nome;
        this.velocidadeMaxima= velocidadeMaxima;
        
    }
    

    public void imprime() {
        System.out.println("------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(Carro.velocidadeLimete);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeLimete() {
        return velocidadeLimete;
    }
    public void setVelocidadeLimete(double velocidadeLimete) {
        this.velocidadeLimete = velocidadeLimete;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
