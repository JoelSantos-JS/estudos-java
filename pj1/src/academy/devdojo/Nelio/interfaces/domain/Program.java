package academy.devdojo.Nelio.interfaces.domain;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import academy.devdojo.Nelio.interfaces.domain.model.CarRental;
import academy.devdojo.Nelio.interfaces.domain.model.Veicule;
import academy.devdojo.Nelio.interfaces.domain.service.BrasilTaxService;
import academy.devdojo.Nelio.interfaces.domain.service.RentalService;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental date");
        System.out.print("Car model:");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/mm/yyyy hh:ss)");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/mm/yyyy hh:ss)");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Veicule(carModel));


        System.out.print("Enter your price per hour ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter your price per day ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrasilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Invoice");

       System.out.println("Basic Payment " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
       System.out.println("Basic Tax " + String.format("%.2f", cr.getInvoice().getTax()));
       System.out.println("Total Payment " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
        sc.close();

    }
}
