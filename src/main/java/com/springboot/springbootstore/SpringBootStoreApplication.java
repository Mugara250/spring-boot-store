package com.springboot.springbootstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootStoreApplication.class, args);
        OrdersService ordersService = context.getBean(OrdersService.class);
//        ordersService.setPaymentService(new PayPalPaymentService());
        ordersService.placeOrder();
    }

}
