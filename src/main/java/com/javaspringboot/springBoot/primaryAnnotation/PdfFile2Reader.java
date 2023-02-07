package com.javaspringboot.springBoot.primaryAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//This class is given priority with @Primary annotation
@Component
//@Primary
public class PdfFile2Reader implements Reader2 {

    @Override
    public String readFile() {
        return "PDF File";
    }

}
