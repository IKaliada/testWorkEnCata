package com.gmail.iikaliada.test.work.service;

import com.gmail.iikaliada.test.work.service.model.RoomDTO;

import java.util.List;

public interface RoomService {
    void createRoom(RoomDTO roomDTO);

    List<RoomDTO> getRooms();

    void bookRoom(RoomDTO roomDTO);

    RoomDTO getRoomById(String id);
}
