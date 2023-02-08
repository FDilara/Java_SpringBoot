package com.javaspringboot.springBoot.injectionTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class InjectionController {

    //Field Injection:
    //The reference variable in a class is overwritten as "@Autowired" and injection takes place while the Spring project starts.
    //The reference variable in the class becomes the field of that class.
    //@Autowired
    //private First3Class first3Class;

    //Setter Injection
    private Second3Class second3Class;

    //Constructor Injection - recommended method
    private ThirdClass thirdClass;

    private First3Class first3Class;

    public InjectionController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    @Autowired
    public InjectionController(@Qualifier("thirdClass") ThirdClass thirdClass, First3Class first3Class) {
        this.thirdClass = thirdClass;
        this.first3Class = first3Class;
    }

    @GetMapping("/names")
    public String getNameOfClass() {
        return this.first3Class.getName() + " - "
                + this.second3Class.getName() + " - "
                + this.thirdClass.getName();
    }

    //Setter Injection
    @Autowired
    public void setSecond3Class(Second3Class second3Class) {
        this.second3Class = second3Class;
    }

}
