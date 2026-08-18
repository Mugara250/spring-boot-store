package com.springboot.springbootstore.notificationservice;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("The message '" + message + "' was sent by an email notification service");
    }
}
