package com.javaspringboot.springBoot.primaryAnnotation;

import org.springframework.stereotype.Component;

@Component
public class ExcelFile2Reader implements Reader2 {
    @Override
    public String read2File() {
        return "EXCEL 2 File";
    }

}
