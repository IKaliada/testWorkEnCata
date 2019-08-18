package com.gmail.iikaliada.test.work.service.converter;

import com.gmail.iikaliada.test.work.repository.model.Room;
import com.gmail.iikaliada.test.work.service.model.RoomDTO;

public interface RoomConverter {
    Room toRoom(RoomDTO roomDTO);

    RoomDTO fromRoom(Room room);
}
