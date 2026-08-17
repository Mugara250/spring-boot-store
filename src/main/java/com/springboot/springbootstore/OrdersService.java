package com.springboot.springbootstore;

public class OrdersService {
    public void processOrder() {
        var payment = new StripePaymentService();
        payment.processPayment(100);
    }
}
