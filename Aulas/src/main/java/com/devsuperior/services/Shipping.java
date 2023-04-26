package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.Entities.Order;

@Service
public class Shipping {
    

    public double shipment(Order order){
        if(order.getDiscount() >= 100 && order.getDiscount() <= 200){
            return order.getBasic() - order.getDiscount() + 12;
        }else if(order.getDiscount() < 100) {
            return order.getBasic() - order.getDiscount()  + 20;
        

        
        }

        return order.getBasic() - order.getDiscount();
            

    }
    
}
