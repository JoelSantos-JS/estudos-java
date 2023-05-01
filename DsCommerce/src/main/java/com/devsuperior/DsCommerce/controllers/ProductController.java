package com.devsuperior.DsCommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.DsCommerce.dto.ProductDto;
import com.devsuperior.DsCommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {


    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDto findById(@PathVariable Long id) {
        ProductDto dto = service.findById(id);

        return dto;
    } 
    @GetMapping
    public Page<ProductDto> findByAll(Pageable pageable) {
         

        return service.findAll(pageable);
    } 
    
}
