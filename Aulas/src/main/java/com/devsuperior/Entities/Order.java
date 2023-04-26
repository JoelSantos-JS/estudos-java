package com.devsuperior.Entities;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.services.OrderService;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;


    @Autowired
    private OrderService orderService;

    


    public Order() {

    }


    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }


    public Integer getCode() {
        return code;
    }


    public Double getBasic() {
        return basic;
    }


    public Double getDiscount() {
        return discount;
    }


    @Override
    public String toString() {
        return "Order [code=" + code + ", basic=" + basic + ", discount=" + discount + "]";
    }


    public OrderService getOrderService() {

        return orderService;
    }

    

    


}
