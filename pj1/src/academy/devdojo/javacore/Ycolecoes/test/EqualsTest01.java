package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Celular;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Joel";
        String nome3 = "Joel";
         Celular celular = new Celular("105c", "Blue");
         Celular celular2 = new Celular("105c", "Blue");

        System.out.println(celular.equals(celular2));
    }
}
