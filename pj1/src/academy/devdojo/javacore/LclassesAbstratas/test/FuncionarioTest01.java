package academy.devdojo.javacore.LclassesAbstratas.test;

import academy.devdojo.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Joel" , 40);
        System.out.println(gerente);

        gerente.calculaBonus();
      
    }
}
