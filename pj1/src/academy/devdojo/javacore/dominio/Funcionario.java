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

     
    }

    public void mediaSalarios(double... num) {
        double media = 0;

        for (double d : salario) {
            media = media + d;  

            System.out.println(media);
        }


        media = media / salario.length;

        System.out.println(media);
        
    }

}
