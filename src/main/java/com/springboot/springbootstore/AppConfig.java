package com.springboot.springbootstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Value("${payment.gateway}")
    private String paymentGateway;

    @Bean
    public StripePaymentService stripePaymentService() {
        return new StripePaymentService();
    }

    @Bean
    public PayPalPaymentService payPalPaymentService() {
        return new PayPalPaymentService();
    }

    @Bean
//    @Scope("prototype")
    public OrdersService ordersService() {
        return paymentGateway.equalsIgnoreCase("stripe") ? new OrdersService(stripePaymentService()) : new OrdersService(payPalPaymentService());
    }
}
