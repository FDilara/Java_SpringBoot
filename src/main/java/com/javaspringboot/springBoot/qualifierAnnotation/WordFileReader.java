package com.javaspringboot.springBoot.qualifierAnnotation;

public class WordFileReader implements Reader {

    //"@Bean" used

    @Override
    public String readFile() {
        return "WORD File";
    }
}
