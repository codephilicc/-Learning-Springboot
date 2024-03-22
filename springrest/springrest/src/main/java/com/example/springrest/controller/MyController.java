package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entities.Course;
import com.example.springrest.service.CourseService;

@RestController
public class MyController {

@Autowired
private CourseService courseService;	
	
//testing purspose	
@GetMapping("/home")
public String home() {
	return "Welcome to courses application";
}

@GetMapping("/courses")
public List<Course> getCourse(){
	return this.courseService.getCourses();
}
	
}
