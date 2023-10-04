package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Rahul");
//		user.setCity("Delhi");
//		user.setStatus("I am java developer");
//
//		User user1 = bean.save(user);
//		System.out.println(user1);
		
		User user1 = new User();
		user1.setName("uttam");
		user1.setCity("City1");
		user1.setStatus("Python Programmer");
		
		User user2 = new User();
		user2.setName("Ankit");
		user2.setCity("City2");
		user2.setStatus("Java Programmer");
		
		User result = userRepository.save(user2);
		
		System.out.println("saved user "+result);
		
		
		System.out.println("done");
		
	}

}
