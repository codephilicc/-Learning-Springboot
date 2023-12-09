package com.learn.springboot.springWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "springboot", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "springboot", "Learn spring", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "springboot", "Learn full statck", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(4, "springboot", "Learn ML", LocalDate.now().plusYears(4), false));

	}

	public List<Todo> findByUserName(String username){
		return todos;
	}
	
}
