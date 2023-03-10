package academy.devdojo.javacore.dominio;

public class Pessoa2 {
    private String nome;
    private int idade;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(idade);
    }
    public void setNome(String nome) {
        this.nome =nome;
    }
    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade invalida");
        }else{
            this.idade =idade;
        }

    }

    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
}
