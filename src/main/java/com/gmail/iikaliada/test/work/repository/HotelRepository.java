package com.gmail.iikaliada.test.work.repository;

import com.gmail.iikaliada.test.work.repository.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
}
