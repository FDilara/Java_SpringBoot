package com.javaspringboot.springBoot.componentScanAnnotation;

import com.javaspringboot.springBoot.componentScanAnnotation.branch.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//1.Filter - myClass1 seen as component
/*@ComponentScan(basePackages = "com.javaspringboot.springBoot.componentScanAnnotation.branch",
                 useDefaultFilters = false,
                 includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                 classes = NewAnnotation.class))*/
//2.Filter - myClass2, myClass3, myClass4 seen as component
/*@ComponentScan(basePackages = "com.javaspringboot.springBoot.componentScanAnnotation.branch",
               includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
               classes = MyClass3.class)) //MyClass3 is component class*/
//3.Filter - myClass1, myClass2 seen as component
/*@ComponentScan(basePackages = "com.javaspringboot.springBoot.componentScanAnnotation.branch",
               includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
               pattern = ".*[12]"))*/
//4.Filter - myClass2 seen as component
@ComponentScan(basePackages = "com.javaspringboot.springBoot.componentScanAnnotation.branch",
               useDefaultFilters = false,
               includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
               pattern = "com.branch.*"), //Add dependency (aop) to "pom.xml" file so that Spring can recognize this statement.

               excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
               classes = MyClass3.class) //Exclude any class
) //excludeFilters: Filtering is done for classes that do not want to be seen as components.
public class CompScanConfiguration {
    //@Autowired
    //private MyClass1 myClass1; //Seen as a component by the generated first filter

    @Autowired
    private MyClass2 myClass2; //Seen as component by default filter

    //@Autowired
    //private MyClass3 myClass3;

    //@Autowired
    //private MyClass4 myClass4;

}
