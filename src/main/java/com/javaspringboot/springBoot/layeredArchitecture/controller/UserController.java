package com.javaspringboot.springBoot.layeredArchitecture.controller;

import com.javaspringboot.springBoot.layeredArchitecture.dto.User;
import com.javaspringboot.springBoot.layeredArchitecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    //When defined this way, the controller class became dependent on this object. (Dependency Injection)
    //private UserService userService = new UserServiceImpl();

    //Spring can manage these dependencies.

    //Creates and maintains an object of the UserServiceImpl class when the project starts.
    //And with "@Autowired" that object is injected into this class
    @Autowired
    private UserService userService;


    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }
}
