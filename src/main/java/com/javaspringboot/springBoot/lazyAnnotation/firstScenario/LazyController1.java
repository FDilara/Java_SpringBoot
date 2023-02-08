package com.javaspringboot.springBoot.lazyAnnotation.firstScenario;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LazyController1 {
    private LazyComponent1 lazyComponent1;

    public LazyController1(LazyComponent1 lazyComponent1) {
        this.lazyComponent1 = lazyComponent1;
    }
}
