package com.devsuperior.DsCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DsCommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
