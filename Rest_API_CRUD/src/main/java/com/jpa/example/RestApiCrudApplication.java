package com.jpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCrudApplication.class, args);
		System.out.println("Hello World");
	}

}
