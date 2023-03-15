package academy.devdojo.javacore.LclassesAbstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome , double salario) {
        super(nome, salario);
        calculaBonus();
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.1;
      }
}
