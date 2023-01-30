package com.padawan.jpa;

import com.padawan.jpa.model.Produto;
import com.padawan.jpa.model.User;
import com.padawan.jpa.repository.ProdutoRepository;
import com.padawan.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var user = new User();

		user.setId(1L);
		user.setCpf("123");
		user.setEmail("asd@gmail.com");
		user.setCpf("12345678901");
//		user.setName("123456789012345678901234567890123456789012345678901234567890");
//		user.setSalary(111.111F);

		User save2 = userRepository.save(user);

//		var produto = new Produto();
//
//		produto.setId(1L);
//		produto.setCreatedAt(LocalDateTime.now());
//		produto.setUpdatedAt(LocalDateTime.now());
//
//		produtoRepository.save(produto);
//
//		Optional<Produto> byId = produtoRepository.findById(1L);
//
//
//		byId.get().setCreatedAt(LocalDateTime.now().plusDays(1));
//		produtoRepository.save(byId.get());





	}
}
