package com.springboot.springbootstore.userregistrationservice;

public interface NotificationService {
    public void send(String message, String recipientEmail);
}
