package com.javaspringboot.springBoot.lazyAnnotation.secondScenario;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LazyController2 {
    /*public Example1 example1;

    public LazyController2(Example1 example1) {
        this.example1 = example1;
    }*/

    private MyConfiguration myConfiguration;

    public LazyController2(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }
}
