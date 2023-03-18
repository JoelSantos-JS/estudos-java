package academy.devdojo.javacore.Oexception.exception.test;

public class ExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception

            System.out.println("Dentro do arrayIndexOutOfBoudnsException");
        }
      catch (IndexOutOfBoundsException e) {
            // TODO: handle exception

            System.out.println("Dentro do IndexOutOfBoundsException");
        }
         catch (IllegalArgumentException e) {
            // TODO: handle exception

            System.out.println("Dentro do IllegalArgumentException");
        }
         catch (ArithmeticException e) {
            // TODO: handle exception

            System.out.println("Dentro do ArithmeticException");
        }
    }
}
