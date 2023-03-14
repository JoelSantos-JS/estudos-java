package academy.devdojo.javacore.Heranca.dominio;



public class Funcionarios extends Pessoa{
   
    private double salario;




    public Funcionarios(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    
    public void relatorioDePagamento(){
        System.out.println("Eu " + this.nome + " Pagamento " +this.salario);
    }

    public double getSalario() {
        return salario;
    }
  

    public void setSalario(double salario) {
        this.salario = salario;
    }
}