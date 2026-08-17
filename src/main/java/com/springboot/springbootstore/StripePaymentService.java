package com.springboot.springbootstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService{
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.timeout:3000}")
    private String timeout;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount " + amount);
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Supported currencies: " + supportedCurrencies);
    }
}
