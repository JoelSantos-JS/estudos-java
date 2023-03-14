package academy.devdojo.javacore.HSobrescritas.domain;

public class Anime extends Object {
   private String nome; 



   @Override
   public String toString() {
    return this.nome;
   }
   public Anime(String nome) {
    this.nome = nome;
   }

   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
}
