package academy.devdojo.javacore.Zgenerics.domain;

import javax.print.DocFlavor.STRING;

public class Client {
    private String nome;
    private long cpf;

    
    public Client(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    

    

    // 
}
