package com.javaspringboot.springBoot.scopeAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecondController {

    @Autowired
    private ScopeComponent scopeComponent;

    @GetMapping("second-controller")
    private String getNameOfComponent() {
        return this.scopeComponent.getName();
    }

}
