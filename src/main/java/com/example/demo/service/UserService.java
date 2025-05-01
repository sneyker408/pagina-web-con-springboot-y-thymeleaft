package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return Arrays.asList(
            new User("Juan", "Pérez", "juan.perez@example.com"),
            new User("María", "Gómez", "maria.gomez@example.com"),
            new User("Carlos", "López", null),
            new User("Ana", "Martínez", "ana.martinez@example.com"),
            new User("Pedro", "Sánchez", null)
        );
    }
}