package com.javaspringboot.springBoot.qualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("PDF")
//@Component
public class PdfFileReader implements Reader {

    @Override
    public String readFile() {
        return "PDF File";
    }

}
