

import java.util.Scanner;

import service.PensionService;
import service.TaxService;

public class Program {
    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();

        System.out.println(pensionService.discount(4000));

        System.out.println(taxService.tax(4000));


        System.out.print("Nome:");

        String name = scanner.nextLine();
        System.out.print("Salário:");

        double grossSalary = scanner.nextDouble();


        double netSalaru = grossSalary * 0.7;

        System.out.println("Seu novo salário é: " + netSalaru);
    }
}
