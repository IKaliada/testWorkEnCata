package com.gmail.iikaliada.test.work.repository;

import com.gmail.iikaliada.test.work.repository.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {
    Room findRoomById(String id);
}
