package com.devsuperior.DsCommerce.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private OrderStatus status;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;


    public Order() {

    }


    public Order(long id, Instant moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }


    public long getId() {
        return id;
    }


    public Instant getMoment() {
        return moment;
    }


    public OrderStatus getStatus() {
        return status;
    }


    public User getClient() {
        return client;
    }

    


    
}
