package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class RestTestApplication {
	
	@RequestMapping("/")
	public String home() {
		return "forward:/hello"; 
	}

	public static void main(String[] args) {
		SpringApplication.run(RestTestApplication.class, args);
	}
}
