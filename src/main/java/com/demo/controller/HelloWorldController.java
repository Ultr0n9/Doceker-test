package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "hello";
	}

	@GetMapping("/messages")
	public String getMessage() {
		return "Tum_to_Achi_Hoti";
	}

}
