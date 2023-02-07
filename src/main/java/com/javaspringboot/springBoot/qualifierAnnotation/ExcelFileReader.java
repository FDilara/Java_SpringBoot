package com.javaspringboot.springBoot.qualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("EXCEL")
//@Component
public class ExcelFileReader implements Reader {
    @Override
    public String readFile() {
        return "EXCEL File";
    }

}
