package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greet() {
		return "Welcome to this web app";
	}
	
	@GetMapping("/about")
	public String about() {
		return "This is a simple web app";
	}

}
