package academy.devdojo.javacore.Oexception.exception.test;

public class ExceptionTest02 {
    public static void main(String[] args) {
       System.out.println(divisao(1, 0));
    }; 

    private static  int divisao(int a , int b) {
       

    try {
        return a/b;
    } catch (ArithmeticException e) {
        // TODO: handle exception
        e.printStackTrace();
        throw e;
    }

    
    }
}
