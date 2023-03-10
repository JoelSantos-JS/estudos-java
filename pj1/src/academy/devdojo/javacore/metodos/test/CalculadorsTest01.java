package academy.devdojo.javacore.metodos.test;

import academy.devdojo.javacore.metodos.Calculadora;

public class CalculadorsTest01 {
    public static void main(String[] args) {
        Calculadora calculadors = new Calculadora();
        calculadors.somaDoisNumeros();
        System.out.println("JOEL");
        calculadors.multiplicaDois(10, 10);
        System.out.println("Joel 2");
       double result = calculadors.divideDoisNumeros(20,2);

       System.out.println(result);
       System.out.println("JOELEEEEE");

       int num1 = 1;
       int   num2 =2;

       calculadors.alteraDoisNumeros(num1, num2);

       System.out.println(num1);

       int[] numeros = {1,23,4,56};
       calculadors.somaTodosOsNumeros(numeros);

       calculadors.somaVarArray(1,4,56,78);

    }
}
