/*
* Ejecución de la logica de negocio
* */
package com.example.springboot.services;

import com.example.springboot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserServices {

    private static UserRepository userRepository;
    private static PasswordEncoder passwordEncoder;

    public static User registerUser(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }
}