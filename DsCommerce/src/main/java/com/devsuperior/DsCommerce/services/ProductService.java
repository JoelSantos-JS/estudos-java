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
    @Transactional
    public ProductDto insert(ProductDto dto) {
      
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setImgUrl(dto.getImgUrl());
        product.setPrice(dto.getPrice());

       product = productRepository.save(product);


       return  new ProductDto(product);

    }
    @Transactional
    public ProductDto put(Long id ,ProductDto dto) {
        
        Product product2 = productRepository.getReferenceById(id);
        product2.setName(dto.getName());
        product2.setDescription(dto.getDescription());
        product2.setImgUrl(dto.getImgUrl());
        product2.setPrice(dto.getPrice());

       product2 = productRepository.save(product2);


       return  new ProductDto(product2);

    }

     
        


      
    }
