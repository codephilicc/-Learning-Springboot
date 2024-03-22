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
		list.add(new Course((long) 122, "java core", "learn java"));
		list.add(new Course((long) 101, "python", "learn python"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourseById(Long id) {
		Course cr = null;
		for (Course c : list) {
			if (c.getId() == id) {
				cr = c;
				break;
			}
		}
		return cr;
	}

	@Override
	public Course postCourses(Course course) {
//		Course c1 = new Course();
//		c1.setId(course.getId());
//		c1.setTitle(course.getTitle());
//		c1.setDescription(course.getDescription());
		list.add(course);
		return course;
	}

	@Override
	public Course deleteCourseById(Long id) {
		Course c2 = null;
		for (Course c : list) {
			if (c.getId() == id) {
				c2 = c;
				list.remove(c2);
				break;
			}
		}
		return c2;
	}

}
