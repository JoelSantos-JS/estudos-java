package academy.devdojo.Nelio.generics.test;

import java.util.Scanner;

import academy.devdojo.Nelio.generics.domain.PrintService;

public class GenericsTes01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
     
       
        PrintService<String> ps = new PrintService();
        System.out.print("Digite o numero ou o nome ");
        int n1 =  sc.nextInt();

    for (int i =0; i < n1; i++) {
        String value = sc.next();
        ps.addValue(value);
    }

    ps.print();
 
    String integer =  ps.pfirts();
System.out.println("Primeiro " + integer) ;

    sc.close();

        }
}
