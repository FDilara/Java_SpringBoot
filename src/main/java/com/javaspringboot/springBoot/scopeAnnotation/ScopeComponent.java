package com.javaspringboot.springBoot.scopeAnnotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //Default value // one object
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //A new object for each injection - two object
//@RequestScope
@SessionScope
public class ScopeComponent {
    public ScopeComponent() {
        System.out.println("ScopeComponent created at " + LocalDateTime.now());
    }

    public String getName() {
        return "ScopeComponent";
    }
}
