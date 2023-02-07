package com.javaspringboot.springBoot.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {
    //Added to IoC container using @Component

    public String getName() {
        return "First Class";
    }

}
