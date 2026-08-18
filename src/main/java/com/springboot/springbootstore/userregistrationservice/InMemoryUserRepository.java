package com.springboot.springbootstore.userregistrationservice;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{
    private final HashMap<String, User> users;

    public InMemoryUserRepository() {
        users = new HashMap<>();
    }

    @Override
    public void save(User user) {
        if (user == null) throw new RuntimeException("User is null");
        users.put(user.getEmail(), user);
        System.out.println("User saved successfully");
    }

    public HashMap<String, User> getUsers() {
        return users;
    }
}
