package academy.devdojo.Nelio.interfaces.domain.model;

import java.sql.Date;

public class CarRental {
    private Date start;
    private Date finish;
    private Veicule veicule;
    private Invoice invoice;

    
    public CarRental(Date start, Date finish, Veicule veicule) {
        this.start = start;
        this.finish = finish;
        this.veicule = veicule;
    }


    public Date getStart() {
        return start;
    }


    public Date getFinish() {
        return finish;
    }


    public Veicule getVeicule() {
        return veicule;
    }


    public Invoice getInvoice() {
        return invoice;
    }
   
    


    
}
