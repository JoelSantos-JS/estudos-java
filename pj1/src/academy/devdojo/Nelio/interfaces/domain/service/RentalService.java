package academy.devdojo.Nelio.interfaces.domain.service;

import academy.devdojo.Nelio.interfaces.domain.model.CarRental;

public class RentalService {
    
    private Double pricePerDay;
    private Double pricePerHour;

    private BrasilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrasilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        
    }


    
}
