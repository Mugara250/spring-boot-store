package com.springboot.springbootstore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class OrdersService {
    private PaymentService paymentService;


//    @Autowired
    OrdersService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Orders service created");
    }

    public void placeOrder() {
        paymentService.processPayment(100);
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("OrderService PreDestroy");
    }
//
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
