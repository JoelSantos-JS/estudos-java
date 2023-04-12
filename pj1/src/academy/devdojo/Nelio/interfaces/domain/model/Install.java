package academy.devdojo.Nelio.interfaces.domain.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Install {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate duDate;
    private Double amount;
    public Install(LocalDate duDate, Double amount) {
        this.duDate = duDate;
        this.amount = amount;
    }
    public LocalDate getDuDate() {
        return duDate;
    }
    public void setDuDate(LocalDate duDate) {
        this.duDate = duDate;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Install [duDate=" + duDate.format(dateTimeFormatter) + ", amount=" + String.format("%.2f", amount)  + "]";
    }


    


    
}
