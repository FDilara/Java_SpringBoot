package com.javaspringboot.springBoot.lazyAnnotation.thirdScenario;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyComponent2 {

    public LazyComponent2() {
        System.out.println("LazyComponent2 bean initialized!");
    }

    public String getName() {
        return "LazyComponent2";
    }

}
