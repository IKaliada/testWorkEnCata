package com.gmail.iikaliada.test.work.repository;

import com.gmail.iikaliada.test.work.repository.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
}
