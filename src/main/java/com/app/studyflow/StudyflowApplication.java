package com.app.studyflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyflowApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello, World!";
	}

}
