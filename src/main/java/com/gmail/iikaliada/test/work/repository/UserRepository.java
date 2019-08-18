package com.gmail.iikaliada.test.work.repository;

import com.gmail.iikaliada.test.work.repository.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}
