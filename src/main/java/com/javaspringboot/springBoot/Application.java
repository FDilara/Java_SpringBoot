package com.javaspringboot.springBoot;

import com.javaspringboot.springBoot.dependencyInjection.SecondClass;
import com.javaspringboot.springBoot.primaryAnnotation.WordFile2Reader;
import com.javaspringboot.springBoot.qualifierAnnotation.WordFileReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
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
