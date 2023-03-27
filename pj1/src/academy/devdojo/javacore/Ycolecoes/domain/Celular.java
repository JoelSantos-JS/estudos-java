package academy.devdojo.javacore.Ycolecoes.domain;

public class Celular {
    private String seria;
    private String marca;

    public Celular(String seria , String marca) {
        this.seria = seria;
        this.marca = marca;
    }

    @Override 
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular celular = (Celular) obj;
        return seria != null && seria.equals(celular.seria) && marca.equals(celular.marca);
    }  

    @Override
    public int hashCode() {
        return seria == null ? 0 : this.seria.hashCode();
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
