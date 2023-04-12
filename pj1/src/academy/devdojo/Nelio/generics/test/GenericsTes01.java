package academy.devdojo.Nelio.generics.test;

import java.util.Scanner;

import academy.devdojo.Nelio.generics.domain.PrintService;

public class GenericsTes01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
     
       
        PrintService ps = new PrintService();
        System.out.print("Digite o numero ");
        int n1 =  sc.nextInt();

    for (int i =0; i < n1; i++) {
        int value = sc.nextInt();
        ps.addValue(value);
    }

    ps.pfirts();

    sc.close();

        }
}
