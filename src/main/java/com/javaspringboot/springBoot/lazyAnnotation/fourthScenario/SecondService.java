package com.javaspringboot.springBoot.lazyAnnotation.fourthScenario;

import org.springframework.stereotype.Service;

@Service
public class SecondService {
    private FirstService firstService;

    public SecondService(FirstService firstService) {
        this.firstService = firstService;
    }
}
