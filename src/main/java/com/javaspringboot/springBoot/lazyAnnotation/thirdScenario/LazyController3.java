package com.javaspringboot.springBoot.lazyAnnotation.thirdScenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class LazyController3 {
    //private LazyComponent2 lazyComponent2;

    //In this state, it is injected directly.
    /*public LazyController3(LazyComponent2 lazyComponent2) {
        this.lazyComponent2 = lazyComponent2;
    }*/

    //In this state, it is injected when needed.
    //It is injected when the getComponentName() method is called.
    /*public LazyController3(@Lazy LazyComponent2 lazyComponent2) {
        this.lazyComponent2 = lazyComponent2;
    }*/

    @Autowired
    @Lazy
    private LazyComponent2 lazyComponent2;

    @GetMapping("/name")
    public String getComponentName() {
        return lazyComponent2.getName();
    }

}
