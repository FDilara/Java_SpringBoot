package com.javaspringboot.springBoot.lazyAnnotation.secondScenario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy //Annotation affects both this class and the bean methods in the class.
public class MyConfiguration {
    //This class was created to send the classes to the IoC Container with the Bean method.

    public MyConfiguration() {
        System.out.println("MyConfiguration bean initialized!");
    }

    @Bean
    //@Lazy
    public Example1 getExample1() {
        return new Example1();
    }

    @Bean
    //@Lazy
    public Example2 getExample2() {
        return new Example2();
    }

}
