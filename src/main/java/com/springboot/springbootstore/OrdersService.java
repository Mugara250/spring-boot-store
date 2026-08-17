package com.springboot.springbootstore;

public class OrdersService {
    public void placeOrder() {
        var payment = new StripePaymentService();
        payment.processPayment(100);
    }
}
