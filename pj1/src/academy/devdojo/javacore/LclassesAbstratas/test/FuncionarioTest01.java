package academy.devdojo.javacore.LclassesAbstratas.test;

import academy.devdojo.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Jole", 50000);
        System.out.println(gerente);

        gerente.calculaBonus();
      
    }
}
