package com.springboot.springbootstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootStoreApplication.class, args);
        OrdersService ordersService = new OrdersService();
        ordersService.setPaymentService(new PayPalPaymentService());
        ordersService.placeOrder();
    }

}
