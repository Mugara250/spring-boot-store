package com.springboot.springbootstore;

import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    PaymentService paymentService;

    OrdersService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
