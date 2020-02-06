package com.webfluxjwt;

import com.webfluxjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
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
