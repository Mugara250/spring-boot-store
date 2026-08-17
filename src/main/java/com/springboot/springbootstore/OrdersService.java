package com.springboot.springbootstore;

public class OrdersService {
    PaymentService paymentService;

//    OrdersService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
