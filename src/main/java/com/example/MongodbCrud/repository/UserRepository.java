package com.example.MongodbCrud.repository;

import com.example.MongodbCrud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
