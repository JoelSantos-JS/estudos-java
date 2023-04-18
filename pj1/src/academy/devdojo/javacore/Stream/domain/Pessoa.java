package academy.devdojo.javacore.Stream.domain;

public class Pessoa {
    private long id;
    private String nome;
    private String nacionalidade;
    private int idade;

    
    public Pessoa(long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(long id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Pessoa [Id=" + id + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + "]";
    }
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public int getIdade() {
        return idade;
    }

    
}
