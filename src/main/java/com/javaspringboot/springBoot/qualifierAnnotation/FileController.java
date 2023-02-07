package com.javaspringboot.springBoot.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class FileController {

    /*
     * First use:
     * @Qualifier("excelFileReader")
     * @Qualifier("pdfFileReader")
     * @Qualifier("getWordFileReader")
     * */
    /*
    * Second use:
    * @Qualifier("EXCEL")
    * @Qualifier("PDF")
    * @Qualifier("WORD")
    * */
    @Autowired
    @Qualifier("WORD")
    private Reader reader;

    @GetMapping(path = "/read")
    public String read() {
        return this.reader.readFile();
    }

}
