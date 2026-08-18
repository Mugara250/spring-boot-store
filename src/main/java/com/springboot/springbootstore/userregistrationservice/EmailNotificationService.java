package com.springboot.springbootstore.userregistrationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{
    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending email.........");
        System.out.println("Message: " + message);
        System.out.println("Recipient email: " + recipientEmail);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }
}
