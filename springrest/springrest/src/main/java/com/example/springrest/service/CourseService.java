package com.example.springrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springrest.entities.Course;


public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourseById(Long id);
}
