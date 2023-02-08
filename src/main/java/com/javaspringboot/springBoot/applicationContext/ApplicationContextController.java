package com.javaspringboot.springBoot.applicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationContextController {

    //ApplicationContext that will perform the inject operation
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/application-context")
    public void examples() {
        // 1. Method : getBeanDefinitionNames()
        /*String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for(String name : beanDefinitionNames) {
            System.out.println(name);
        }*/

        // 2. Method : getBeanDefinitionCount()
        /*int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);*/

        // 3. Method : getBean() *** most used method
        //MyComponent3 myComponent3 = (MyComponent3) applicationContext.getBean("myComponent3");
        //MyComponent3 myComponent3 = (MyComponent3) applicationContext.getBean(MyComponent3.class);
        //System.out.println(myComponent3.getNameContent());

        // 4. Method : getType()
        /*Class<?> myComponent3 = applicationContext.getType("myComponent3");
        assert myComponent3 != null;
        System.out.println(myComponent3.getSimpleName());*/

        // 5. Method : containsBean()
        /*boolean myComponent3 = applicationContext.containsBean("myComponent3");
        System.out.println(myComponent3);*/


    }

}
