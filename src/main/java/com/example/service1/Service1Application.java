package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	@GetMapping public String test1() {
		return "test1 method of service1";
	}
	@GetMapping public String test2() {
		return "test1 method of service1";
	}

}
