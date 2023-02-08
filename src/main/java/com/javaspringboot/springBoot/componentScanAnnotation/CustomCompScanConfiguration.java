package com.javaspringboot.springBoot.componentScanAnnotation;

import com.javaspringboot.springBoot.componentScanAnnotation.branch.MyClass6;
import com.javaspringboot.springBoot.componentScanAnnotation.branch.MyClass5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.javaspringboot.springBoot.componentScanAnnotation.branch",
               useDefaultFilters = false,
               includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,
               classes = CustomFilter.class))
public class CustomCompScanConfiguration {

    @Autowired
    private MyClass6 myClass6;

    @Autowired
    private MyClass5 myClass5;
}
