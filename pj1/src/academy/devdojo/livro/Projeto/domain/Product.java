package academy.devdojo.livro.Projeto.domain;

import java.math.BigDecimal;

import javafx.scene.shape.Path;

public class Product {
    private String name;
    private Path file;
    private BigDecimal price;

    
    public Product(String name, Path file, BigDecimal price) {
        this.name = name;
        this.file = file;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Path getFile() {
        return file;
    }
    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", file=" + file + ", price=" + price + "]";
    }

    

    

}
