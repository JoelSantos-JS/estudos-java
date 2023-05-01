package com.devsuperior.DsCommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        Product product  = productRepository.findById(id).get();
       
        ProductDto productDto = new ProductDto(product);


        return productDto;
    }

    @Transactional(readOnly = true)
    public Page<ProductDto> findAll(Pageable pageable)  {
        Page<Product> product  = productRepository.findAll(pageable);
    

     
        


        return product.map(e -> new ProductDto(e));
    }
}
