package academy.devdojo.livro;

public class Usuario {
    private String nome;
    private int ponto;
    private boolean moderador;
    public Usuario(String nome, int ponto ) {
        this.nome = nome;
        this.ponto = ponto;
        this.moderador = false;
    }
    public String getNome() {
        return nome;
    }
    public int getPonto() {
        return ponto;
    }
    public boolean isModerador() {
        return moderador;
    }
    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", ponto=" + ponto + "]";
    }


    
    
}
