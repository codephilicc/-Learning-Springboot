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
	
		UserRepository bean = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Rahul");
		user.setCity("Delhi");
		user.setStatus("I am java developer");

		User user1 = bean.save(user);
		System.out.println(user1);
		
	}

}
