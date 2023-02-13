package com.javaspringboot.springBoot.primaryAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class File2Controller {
    @Autowired
    private Reader2 reader1;
    @Autowired
    @Qualifier("excelFile2Reader")
    private Reader2 reader2;

    @GetMapping(path = "/read2")
    public String read2() {
        return this.reader1.read2File() + " - " + this.reader2.read2File();
    }

}
