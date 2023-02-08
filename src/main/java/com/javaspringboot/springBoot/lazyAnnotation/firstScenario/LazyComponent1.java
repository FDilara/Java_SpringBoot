package com.javaspringboot.springBoot.lazyAnnotation.firstScenario;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyComponent1 {
    public LazyComponent1() {
        System.out.println("LazyComponent bean initialized!");
    }
}
