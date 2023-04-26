

import java.util.Scanner;

import Entities.Employ;
import service.PensionService;
import service.SalaryService;
import service.TaxService;

public class Program {
    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);

    

     
        System.out.print("Nome:");

        String name = scanner.nextLine();
        System.out.print("Salário:");

        double grossSalary = scanner.nextDouble();

        Employ employ = new Employ(name, grossSalary);

        SalaryService salaryService = new SalaryService(new TaxService(), new PensionService());
        double newSalary = salaryService.netSalay(employ);
        System.out.println("Seu novo salário é: " +newSalary );

        scanner.close();
    }
}
