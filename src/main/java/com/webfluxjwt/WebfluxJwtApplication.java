package com.webfluxjwt;

import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webfluxjwt.documents.AuthrizationRequest;
import com.webfluxjwt.documents.User;
import com.webfluxjwt.repository.UserRepository;

@SpringBootApplication
public class WebfluxJwtApplication {
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebfluxJwtApplication.class, args);
	}
	
	/*
	 * @PostConstruct public void init() { User user = new User();
	 * Stream<AuthrizationRequest> auth = Stream.of( new
	 * AuthrizationRequest("prasadp", "psaaword", "Prasad@gmail.com") );
	 * BeanUtils.copyProperties(auth, user); System.out.println(user.getUserName());
	 * userRepository.save(user); }
	 */
}
