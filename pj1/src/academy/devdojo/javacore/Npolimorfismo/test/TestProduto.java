package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TestProduto {
    public static void main(String[] args) {
        Computador computador = new Computador("Joel", 1110);
        Tomate tomate = new Tomate("Tom", 1000);
        Televisao tbv = new Televisao("smart", 50000);

       CalculadoraImposto.calcularImposto(computador);
       CalculadoraImposto.calcularImposto(tomate);
       CalculadoraImposto.calcularImposto(tbv);
    }
}
