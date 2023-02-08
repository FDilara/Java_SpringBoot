package com.javaspringboot.springBoot;

import com.javaspringboot.springBoot.dependencyInjection.SecondClass;
import com.javaspringboot.springBoot.primaryAnnotation.WordFile2Reader;
import com.javaspringboot.springBoot.qualifierAnnotation.WordFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
//@ComponentScan(useDefaultFilters = false) //Default filter is disabled
//@ComponentScan(basePackages = "com") //All projects under "com"
//For example;
//@ComponentScan(basePackages = {"com", "com.branch"}) //Package list can also be given
//@ComponentScan(basePackageClasses = {MyComponent.class, MyService.class})
//@ComponentScan(basePackageClasses = MyComponent.class) = @ComponentScan(basePackages = "com.branch")
//Let's consider MyComponent class as below branch package. Then the two equalized expressions above mean the same thing.
public class Application {
	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);

		//The purpose here is to find the implemented class of ApplicationContext
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
	    //System.out.println(applicationContext.getClass());

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		for(String name : beanDefinitionNames) {
			System.out.println(name);
		}

	}

	@Bean
	public SecondClass getSecondClass() {
		return new SecondClass();
	}

	@Bean("WORD")
	//@Bean
	public WordFileReader getWordFileReader() {
		return new WordFileReader();
	}

	@Bean
	@Primary
	public WordFile2Reader getWordFile2Reader() {
		return new WordFile2Reader();
	}

}
