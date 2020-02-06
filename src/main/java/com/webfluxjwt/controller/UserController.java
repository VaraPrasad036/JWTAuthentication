package com.webfluxjwt.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webfluxjwt.config.JwtUtil;
import com.webfluxjwt.documents.AuthrizationRequest;
import com.webfluxjwt.documents.User;
import com.webfluxjwt.repository.UserRepository;
import com.webfluxjwt.utils.MapConversion;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	MapConversion conversion;
	
	@PostMapping("/create")
	public AuthrizationRequest createUser(@RequestBody AuthrizationRequest request) {
		 User user = conversion.convertToUser(request);
		 userRepository.save(user);
		 return conversion.convertToAuthUser(user);
	}
	
	
	@PostMapping("/authenticate")
	public String authentication(@RequestBody AuthrizationRequest request) {
		User user = userRepository.findByUserName(request.getUserName()); 
		if(user.getUserName().equalsIgnoreCase(request.getUserName())) {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
		} else {
			
		}
		String generateToken = jwtUtil.generateToken(request.getUserName());
		return generateToken;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
