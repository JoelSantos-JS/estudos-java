package academy.devdojo.Nelio.interfaces.domain.model;

import java.util.Date;

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


    public void setStart(Date start) {
        this.start = start;
    }


    public void setFinish(Date finish) {
        this.finish = finish;
    }


    public void setVeicule(Veicule veicule) {
        this.veicule = veicule;
    }


    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
   
    


    
}
