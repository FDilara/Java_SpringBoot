package com.javaspringboot.springBoot.scopeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
    @Autowired
    private ScopeComponent scopeComponent;

    @GetMapping("first-controller")
    private String getNameOfComponent() {
        return this.scopeComponent.getName();
    }

}
