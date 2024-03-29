package academy.devdojo.livro.Projeto.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import academy.devdojo.Nelio.Colections.test.Collections;

public class Payment {
    private List<Product> products;
    private LocalDateTime date;
    private Customer customer;
    public Payment(List<Product> products, LocalDateTime date, Customer customer) {
        this.products = Collections.unmodifiableList(products);
        this.date = date;
        this.customer = customer;
    }
    public List<Product> getProducts() {
        return products;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public Customer getCustomer() {
        return customer;
    }
    @Override
    public String toString() {
        return "Payment [date=" + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + ", customer=" + customer + "Products" +  products + "]";
    }

    

    
}
