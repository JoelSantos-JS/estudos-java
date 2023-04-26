package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.Entities.Order;

@Service
public class OrderService extends Shipping {


    public OrderService(){
        super();
    }

    public double total(Order order) {
        return order.getBasic() - shipment(order);
    }
}
