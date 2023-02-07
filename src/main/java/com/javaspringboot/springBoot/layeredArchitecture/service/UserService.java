package com.javaspringboot.springBoot.layeredArchitecture.service;

import com.javaspringboot.springBoot.layeredArchitecture.dto.User;

public interface UserService {
    //method signature of the job to be performed
    User getUserById(Long userId);
}
