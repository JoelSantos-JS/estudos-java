package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.Entities.Order;

@Service
public class Shipping {
    

    public double shipment(Order order){
        if(order.getDiscount() >= 100 && order.getDiscount() <= 200){
            return order.getBasic() * 0.12;
        }else if(order.getDiscount() < 100) {
            return order.getBasic() * 0.2;
        

        
        }

        return order.getDiscount();
            

    }
    
}
