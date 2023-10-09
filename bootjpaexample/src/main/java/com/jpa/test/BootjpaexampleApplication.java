package com.jpa.test;

import java.util.List;
import java.util.Optional;

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
		
//		User user1 = new User();
//		user1.setName("uttam");
//		user1.setCity("City1");
//		user1.setStatus("Python Programmer");
//		
//		User user2 = new User();
//		user2.setName("Ankit");
//		user2.setCity("City2");
//		user2.setStatus("Java Programmer");
		
//		single user saving
//		User result = userRepository.save(user2);
		
//		save multiple objects
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
//		System.out.println("saved user "+result);
		
//		System.out.println("done");
		
		
//		update the user of id 202
//		Optional<User> optional = userRepository.findById(202);
//		User user = optional.get();
//		user.setName("Ankit Tiwari");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
//		how to get the data		
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(User->System.out.println(User));
//		
//		Deleting the user element
//		userRepository.deleteById(202);
//		System.out.println("Deleted");
//		Iterable<User> allUsers = userRepository.findAll();
//		allUsers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allUsers);
	
//		List<User> user = userRepository.findByName("Ankit");
//		user.forEach(u->System.out.println(u));
		List<User> usr = userRepository.findByNameAndCity("Ankit","delhi");
		usr.forEach(u->System.out.println(u));
		
	}

}
