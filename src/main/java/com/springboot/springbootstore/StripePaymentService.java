package com.springboot.springbootstore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StripePaymentService implements PaymentService{
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount " + amount);
    }
}
