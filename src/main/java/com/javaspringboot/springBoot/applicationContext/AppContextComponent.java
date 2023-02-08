package com.javaspringboot.springBoot.applicationContext;

import org.springframework.stereotype.Component;

@Component
public class AppContextComponent {
    public String getNameContent() {
        return "My component name is AppContextComponent";
    }
}
