package com.javaspringboot.springBoot.layeredArchitecture.service.implementation;

import com.javaspringboot.springBoot.layeredArchitecture.dto.User;
import com.javaspringboot.springBoot.layeredArchitecture.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Long userId) {
        return null;
    }
}
