package com.webfluxjwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.webfluxjwt.documents.User;

public interface UserRepository extends MongoRepository<User, Long>{

	User findByUserName(String username);

}
