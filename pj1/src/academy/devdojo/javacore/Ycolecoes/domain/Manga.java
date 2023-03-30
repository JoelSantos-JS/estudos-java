package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome , double preco) {
        Objects.nonNull(id);
        Objects.nonNull(nome);
        Objects.nonNull(preco);

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }






  

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantidade;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        if (quantidade != other.quantidade)
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }





public int getQuantidade() {
    return quantidade;
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
