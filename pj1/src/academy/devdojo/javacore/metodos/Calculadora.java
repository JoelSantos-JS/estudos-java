package academy.devdojo.javacore.metodos;

public class Calculadora {
    public static void somaDoisNumeros() {
        System.out.println(10 +10);
    }


    public static void multiplicaDois(int num , int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(int num, double num2){
        return num/num2;
    }

    public void alteraDoisNumeros(int num1 , int num2) {
        num1 =99;
        num2 = 33;
        System.out.println("Dentro dois");
        System.out.println("nUM" +num1);
        System.out.println("nUM" +num2);
    }
}
