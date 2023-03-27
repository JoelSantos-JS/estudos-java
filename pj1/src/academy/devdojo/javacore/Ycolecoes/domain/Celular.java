package academy.devdojo.javacore.Ycolecoes.domain;

public class Celular {
    private String seria;
    private String marca;

    public Celular(String seria , String marca) {
        this.seria = seria;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSeria() {
        return seria;
    }
     public void setSeria(String seria) {
         this.seria = seria;
     }

}
