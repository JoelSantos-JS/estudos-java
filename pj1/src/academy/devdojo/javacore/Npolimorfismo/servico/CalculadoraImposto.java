package academy.devdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
  
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatoria de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço "  + produto.getValor());
        System.out.println("imposto a ser pago " + imposto);

        if(produto instanceof Tomate) {

      
        Tomate tomate = (Tomate) produto;


        System.out.println(tomate.getDataDevalidade());

    }
    }
}
