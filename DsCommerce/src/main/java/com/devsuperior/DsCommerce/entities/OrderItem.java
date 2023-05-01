package com.devsuperior.DsCommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    
    @EmbeddedId
    private OrderItemPk id = new OrderItemPk();

    private Integer quantity;
    private Double price;

    public OrderItem(){

    }

    public OrderItem(Order order , Product product ,Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    
    public Order getOrder( ) {
         return id.getOrder();
    }
    public Product getProduct( ) {
         return id.getProduct();
    }
    public Integer quantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }



    
    
}
