package academy.devdojo.livro.Projeto.domain;

public class Customer {
    private String nome;

    public Customer(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Customer [nome=" + nome + "]";
    }

    

    
}
