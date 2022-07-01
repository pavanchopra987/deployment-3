package com.learn.deploy.deployment3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String home() {
		return "Home page";
	}
	
	@GetMapping("/about")
	public String about() {
		return "About page";
	}
}
