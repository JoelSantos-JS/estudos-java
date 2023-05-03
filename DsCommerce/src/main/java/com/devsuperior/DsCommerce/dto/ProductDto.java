package com.devsuperior.DsCommerce.dto;

import com.devsuperior.DsCommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDto {

    private long id;

    @NotEmpty(message = "Campo obrigatário")
    @NotBlank(message = "Campo obrigatário")
    @Size(min = 5, message =  "Minimo 5")
    private String name;

    @NotEmpty(message = "Campo obrigatário")
    @Size(min = 10, message =  "Minimo 10")
    private String description;

    @Positive(message = "Preço deve ser positivo")
    @NotNull(message = "Campo obrigatário")
    private Double price;
    private String imgUrl;


    


    public ProductDto(long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDto(Product entiti) {
        this.id = entiti.getId();
        this.name = entiti.getName();
        this.description = entiti.getDescription();
        this.price = entiti.getPrice();
        this.imgUrl = entiti.getImgUrl();
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public Double getPrice() {
        return price;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    


    

}
