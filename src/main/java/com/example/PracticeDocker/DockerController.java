package com.example.PracticeDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping(value="/Get")
public String getName() {
		return "HelloWorld";
	}
}
