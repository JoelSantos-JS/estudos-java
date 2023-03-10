package academy.devdojo.javacore.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario[0]);
        System.out.println(this.salario[1]);
        System.out.println(this.salario[2]);

        int media = 0;

        for (double d : salario) {
            media /= d;    
        }

        System.out.println(media);
        
    }

    public void mediaSalarios(double... num) {
      
    }

}
