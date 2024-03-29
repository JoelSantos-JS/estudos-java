package academy.devdojo.Nelio.Colections.domain;

public class Client implements Comparable<Client> {
    private String nome;
    private String email;

    
    public Client(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean staticPrive(Client client) {
        return client.getNome() != "Jose";
    }
    public  boolean nonstaticPrive() {
        return getNome() != "Jose";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        Client other = (Client) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Client [nome=" + nome + ", email=" + email + "]";
    }
    @Override
    public int compareTo(Client o) {
        // TODO Auto-generated method stub
        return  email.compareTo(o.getEmail()) ;
    }
    

    

    
}
