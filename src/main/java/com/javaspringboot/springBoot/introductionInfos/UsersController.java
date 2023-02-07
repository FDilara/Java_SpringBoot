package com.javaspringboot.springBoot.introductionInfos;

import com.javaspringboot.springBoot.introductionInfos.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UsersController {

    @PostMapping(path = "users")
    public User saveUser(@RequestBody User user) {
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }

    @PostMapping(path = "all-users")
    public List<User> saveAllUsers(@RequestBody List<User> users) {
        System.out.println("All users saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }
}
