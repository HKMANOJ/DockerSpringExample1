package com.example.fristproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FristprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristprojectApplication.class, args);
	}

	@GetMapping("/")
	public String home(){

		return "This is Docker example";
	}

}
