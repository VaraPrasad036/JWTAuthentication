package com.webfluxjwt.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.webfluxjwt.documents.AuthrizationRequest;
import com.webfluxjwt.documents.User;

@Service
public class MapConversion {
	
	public User convertToUser(AuthrizationRequest request) {
		User user = new User();
		BeanUtils.copyProperties(request, user);
		return user;
	}
	
	public AuthrizationRequest convertToAuthUser(User user) {
		AuthrizationRequest auth = new AuthrizationRequest();
		BeanUtils.copyProperties(user, auth);
		return auth;
	}

}
