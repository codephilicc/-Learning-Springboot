package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Course> getCourse() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{id}")
	public Course getCoursebyId(@PathVariable String id) {
		return this.courseService.getCourseById(Long.parseLong(id));
	}

	@PostMapping("/courses")
	public Course postCourse(@RequestBody Course course) {
		return this.courseService.postCourses(course);
	}
	
	
	@DeleteMapping("courses/{id}")
	public void deleteCoursebyId(@PathVariable String id) {
		this.courseService.deleteCourseById(Long.parseLong(id));
	}
	
}
