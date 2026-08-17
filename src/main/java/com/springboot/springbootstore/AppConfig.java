package com.springboot.springbootstore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public StripePaymentService stripePaymentService() {
        return new StripePaymentService();
    }

    @Bean
    public PayPalPaymentService payPalPaymentService() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrdersService ordersService() {
        return new OrdersService(stripePaymentService());
    }
}
