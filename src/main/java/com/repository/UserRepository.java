package com.repository;

import com.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository< User, String> {

    public User findByUsername(String username);
}