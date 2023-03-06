package academy.devdojo.introducao;

public class Aula06 {
    public static void main(String[] args) {
        
        int idade = 19;
        if(idade <15) {
            System.out.println("Categoria infatil");
        }else if(idade >=15 && idade < 18) {
            System.out.println("Categoria Junvenil");
        }else if(idade >= 18) {
            System.out.println("Cateoria adulto");
        }

    }
}
