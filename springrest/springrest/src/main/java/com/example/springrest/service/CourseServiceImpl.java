package com.example.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course((long) 122,"java core","learn java"));
		list.add(new Course((long)101,"python","learn python"));	
	}
	
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

}
