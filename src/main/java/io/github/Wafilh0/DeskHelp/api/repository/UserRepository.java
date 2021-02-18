package io.github.Wafilh0.DeskHelp.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.Wafilh0.DeskHelp.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);
	
}
