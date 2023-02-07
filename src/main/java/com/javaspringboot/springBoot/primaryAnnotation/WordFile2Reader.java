package com.javaspringboot.springBoot.primaryAnnotation;

import org.springframework.stereotype.Component;

@Component
public class WordFile2Reader implements Reader2 {
    @Override
    public String readFile() {
        return "WORD File";
    }
}
