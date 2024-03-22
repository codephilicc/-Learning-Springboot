package com.example.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//testing purspose	
@GetMapping("/home")
public String home() {
	return "Welcome to courses application";
}
	
}
