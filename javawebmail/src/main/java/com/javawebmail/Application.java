package com.javawebmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan 
@EnableAutoConfiguration
@SpringBootApplication
@ImportResource(value = { "classpath:spring/*.xml"})

public class Application {

	public static void main(String[] args) {
		System.out.println("Start Spring Application");
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
	}

}
