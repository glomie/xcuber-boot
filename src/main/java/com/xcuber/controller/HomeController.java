package com.xcuber.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping()
	public String home() {
		return "Welcome!" + name;
	}
	
	@Value("${mine.name}")
	private String name;
}
