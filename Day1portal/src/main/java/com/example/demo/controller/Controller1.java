package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller1 {
	//Exercise 1
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome String Boot!";
	}
	
	
	
}
