package com.devsuperior.DsCommerce.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "tb_category")
public class Category {
    private Long id;
    private String name;

    private Set<Product> products = new HashSet<>();
    

    public Category() {}


    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }


    public Set<Product> getProducts() {
        return products;
    }


   

    

    
}
