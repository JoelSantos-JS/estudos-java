package academy.devdojo.javacore.Heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;


    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereço.getRua() +" " + this.endereço.getCep());
    }

     public String getCpf() {
         return cpf;
     }
     public String getNome() {
         return nome;
     }
     public Endereço getEndereço() {
         return endereço;
     }
     public void setCpf(String cpf) {
         this.cpf = cpf;
     }
     public void setEndereço(Endereço endereço) {
         this.endereço = endereço;
     }
     public void setNome(String nome) {
         this.nome = nome;
     }

    

}
