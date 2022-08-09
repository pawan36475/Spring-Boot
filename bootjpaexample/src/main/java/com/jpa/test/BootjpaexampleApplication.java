package com.jpa.test;

import java.util.*;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		User user1 = new User();
		user1.setName("udit");
		user1.setCity("pune");
		user1.setStatus("composer");

		User user2 = new User();
		user2.setName("himesh");
		user2.setCity("nasik");
		user2.setStatus("dancer");

		// User user1=(User) userRepository.save(user);
		// System.out.println(user1);

//		// saving multiple objects
//	List<User> users = List.of(user1, user2);
//	Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user.getCity());
//		});
//		Iterable<User> allUsers=userRepository.findAll();
//		allUsers.forEach(e->System.out.println(user));

		// update the user
//		Optional<User> optional = userRepository.findById(11);
//		User user = optional.get();
//		user.setName("Amrinder");
//
//		User result = userRepository.save(user);
//		System.out.println(result);

		// how to get the data

		// findById(id)-rerun Optional Containing your data

//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
////		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user.getName());
//		}//or

//		itr.forEach(new Consumer<User>() { // Anonymous class
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t.getCity() );
//			}
//		});
		// itr.forEach(user->{System.out.println(user.getStatus());});

		// deleting all users

//		Iterable<User> allUsers=userRepository.findAll();
//		allUsers.forEach(user->{System.out.println(user.getId());});
//		
//		userRepository.deleteAll(allUsers);
//		
//		allUsers.forEach(user->{System.out.println(user.getName());});
//	
//		List<User> users=userRepository.findByName("himesh");
//        users.forEach(user->{System.out.println(user.getName());});

//		List<User> users = userRepository.findByNameAndCity("himesh", "nasik");
//		users.forEach(user -> {
//			System.out.println(user.getName() + " " + user.getCity());
//		});
//		List<User> users = userRepository.getAllUser();
//		users.forEach(user -> {
//			System.out.println(user.getName());
//		});

//		List<User> users = userRepository.getUserByName("himesh");
//		users.forEach(user -> {
//			System.out.println(user.getCity());
//		});

		List<User> users=userRepository.getUsers();
		users.forEach(user->{System.out.println(user.getStatus());});
	}

}
