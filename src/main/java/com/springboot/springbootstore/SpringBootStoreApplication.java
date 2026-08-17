package com.springboot.springbootstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootStoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(SpringBootStoreApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStoreApplication.class, args);
        OrdersService ordersService = context.getBean(OrdersService.class);
        OrdersService ordersService1 = context.getBean(OrdersService.class);
//        ordersService.setPaymentService(new PayPalPaymentService());
        ordersService.placeOrder();
        context.close();
//        NotificationManager notificationManager = context.getBean(NotificationManager.class);
//        notificationManager.sendNotification("Hello, you have a new notification");
    }

}
