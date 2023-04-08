package academy.devdojo.javacore.Zgenerics.domain;

public class Aluno {
    private String nome;
    private int numeroMatricula;
    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }
    public String getNome() {
        return nome;
    }

    
   
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }
  
    
}
