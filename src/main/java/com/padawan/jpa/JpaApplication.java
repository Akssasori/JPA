package com.padawan.jpa;

import com.padawan.jpa.model.User;
import com.padawan.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var user = new User();

		user.setId(1L);
		user.setCpf("123");
		user.setEmail("asd@gmail.com");
//		user.setSalary(111.111F);

		userRepository.save(user);
	}
}
