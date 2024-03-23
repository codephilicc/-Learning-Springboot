package com.example.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrest.dao.CourseDao;
import com.example.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;

	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course((long) 122, "java core", "learn java"));
//		list.add(new Course((long) 101, "python", "learn python"));
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourseById(Long id) {
//		Course cr = null;
//		for (Course c : list) {
//			if (c.getId() == id) {
//				cr = c;
//				break;
//			}
//		}
		return courseDao.getOne(id);
	}

	@Override
	public Course postCourses(Course course) {
//		Course c1 = new Course();
//		c1.setId(course.getId());
//		c1.setTitle(course.getTitle());
//		c1.setDescription(course.getDescription());
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourseById(Long id) {
//		Course c2 = null;
//		for (Course c : list) {
//			if (c.getId() == id) {
//				c2 = c;
//				list.remove(c2);
//				break;
//			}
//		}
		courseDao.deleteById(id);
	}

	@Override
	public Course updateCourses(Course course) {
//		Course c3 = null;
//		for (Course c4 : list) {
//			if (c4.getId() == course.getId()) {
//				c4.setTitle(course.getTitle());
//				c4.setDescription(course.getDescription());
//				c3 = c4;
//				list.remove(c4);
//				list.add(c3);
//				break;
//			}
//		}
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

}
