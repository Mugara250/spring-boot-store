package com.springboot.springbootstore.notificationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("The message '" + message + "' was sent using an SMS notification service");
    }
}
