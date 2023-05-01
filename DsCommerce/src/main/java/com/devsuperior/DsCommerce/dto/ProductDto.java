package com.devsuperior.DsCommerce.dto;

import com.devsuperior.DsCommerce.entities.Product;

public class ProductDto {

    private long id;
    private String name;

    private String description;
    private Double price;
    private String imgUrl;


    public ProductDto() {}


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
