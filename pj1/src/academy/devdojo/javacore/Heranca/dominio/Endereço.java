package academy.devdojo.javacore.Heranca.dominio;

public class Endereço {
    private String rua;
    private String cep;

    public Endereço(String rua , String cep) {
        this.rua= rua;
        this.cep = cep;

    }

    public String getCep() {
        return cep;
    }
    public String getRua() {
        return rua;
    }
     public void setRua(String rua) {
         this.rua = rua;
     }public void setCep(String cep) {
         this.cep = cep;
     }
}
