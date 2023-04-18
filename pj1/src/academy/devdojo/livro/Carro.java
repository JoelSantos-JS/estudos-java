package academy.devdojo.livro;

public class Carro {
    private String cor;
    private int ano;
    public Carro(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public int getAno() {
        return ano;
    }


    public void ligar() {
        System.out.println("Ligando");
    }

    public void desligar(){
        System.out.println("Desligando");
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }
    @Override
    public String toString() {
        return "Carro [cor=" + cor + ", ano=" + ano + "]";
    }


    
    

    
}
