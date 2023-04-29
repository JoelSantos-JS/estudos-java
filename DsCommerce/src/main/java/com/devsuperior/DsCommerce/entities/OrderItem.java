package com.devsuperior.DsCommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_order_item")
public class OrderItem {
    
    @EmbeddedId
    private OrderItemPk id = new OrderItemPk();

    private Integer quatity;
    private Double price;

    public OrderItem(){

    }

    public OrderItem(Order order , Product product ,Integer quatity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quatity = quatity;
        this.price = price;
    }

    
    public Order getOrder( ) {
         return id.getOrder();
    }
    public Product getProduct( ) {
         return id.getProduct();
    }
    public Integer getQuatity() {
        return quatity;
    }

    public Double getPrice() {
        return price;
    }



    
    
}
