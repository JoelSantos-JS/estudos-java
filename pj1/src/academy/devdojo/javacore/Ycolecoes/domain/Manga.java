package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga {
    private Long id;
    private String nome;
    private double preco;

    private Manga(Long id, String nome , double preco) {
        Objects.nonNull(id);
        Objects.nonNull(nome);
        Objects.nonNull(preco);

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override

    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }


    @Override
    public String toString() {
        return "Manga" + "Id" + id+ "Nome:" + nome + "preco" + preco;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Manga manga = (Manga) obj;
        return Double.compare(manga.preco, preco) == 0 && id.equals(manga.id) && nome.equals(manga.nome);
    }


    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
}
