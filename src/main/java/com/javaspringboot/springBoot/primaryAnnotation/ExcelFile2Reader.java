package com.javaspringboot.springBoot.primaryAnnotation;

import org.springframework.stereotype.Component;

@Component
public class ExcelFile2Reader implements Reader2 {
    @Override
    public String readFile() {
        return "EXCEL File";
    }

}
