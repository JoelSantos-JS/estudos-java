package com.devsuperior.DsCommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public  ResponseEntity< ProductDto> findById(@PathVariable Long id) {
        ProductDto dto = service.findById(id);

        return ResponseEntity.ok(dto);
    } 
    @GetMapping
    public ResponseEntity< Page<ProductDto>>findByAll(Pageable pageable) {
         Page<ProductDto> productDto = service.findAll(pageable);

        return ResponseEntity.ok(productDto);
    } 
    @PostMapping
    public ResponseEntity< ProductDto> insert(@RequestBody ProductDto dto) {
         ProductDto productDto = service.insert(dto);

        return ResponseEntity.status(201).body(productDto);
    } 
    
}
