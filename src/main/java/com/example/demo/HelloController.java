package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/greetings")
	public String greetings(){
		return "My First Spring Boot Application!!";
	}
}
