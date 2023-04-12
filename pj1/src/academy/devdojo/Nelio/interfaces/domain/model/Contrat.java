package academy.devdojo.Nelio.interfaces.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrat {
    private Integer number;
    private Date date;
    private Double totalValue;

    private List<Install> installs = new ArrayList<>();
    
    
    public Contrat(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    public List<Install> getInstalls() {
        return installs;
    }

    
}
