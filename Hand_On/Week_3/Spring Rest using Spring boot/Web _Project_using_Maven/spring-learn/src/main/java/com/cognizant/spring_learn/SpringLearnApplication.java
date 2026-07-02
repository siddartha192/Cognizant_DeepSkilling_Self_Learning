package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		System.out.println("Main method Execution Started");
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("Spring Boot Application Started Successfully");
	}

}
