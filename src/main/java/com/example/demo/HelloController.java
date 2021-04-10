package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String greet(){
		return "Hello..First Spring Boot Application!!";
	}
}
