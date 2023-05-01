package com.devsuperior.DsCommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.DsCommerce.dto.ProductDto;
import com.devsuperior.DsCommerce.entities.Product;
import com.devsuperior.DsCommerce.repository.ProductRepository;

@Service //registra a classe como um componente do spring, que vai ser injetado em outras classes
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;


    @Transactional(readOnly = true)
    public ProductDto  findById(Long id) {
        Optional<Product> result = productRepository.findById(id);
        Product product = result.get();

        ProductDto productDto = new ProductDto(product);


        return productDto;
    }
}
