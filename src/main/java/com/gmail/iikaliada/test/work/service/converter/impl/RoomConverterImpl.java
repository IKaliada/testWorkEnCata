package com.gmail.iikaliada.test.work.service.converter.impl;

import com.gmail.iikaliada.test.work.repository.model.Room;
import com.gmail.iikaliada.test.work.service.converter.RoomConverter;
import com.gmail.iikaliada.test.work.service.model.RoomDTO;
import org.springframework.stereotype.Component;

@Component
public class RoomConverterImpl implements RoomConverter {
    @Override
    public Room toRoom(RoomDTO roomDTO) {
        Room room = new Room();
        room.setId(roomDTO.getId());
        room.setName(roomDTO.getName());
        room.setNumberOfBed(roomDTO.getNumberOfBed());
        room.setPrice(roomDTO.getPrice());
        room.setEmpty(roomDTO.getFree());
        room.setBookingDateTo(roomDTO.getBookingDateTo());
        room.setBookingDateFrom(roomDTO.getBookingDateFrom());
        return room;
    }

    @Override
    public RoomDTO fromRoom(Room room) {
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setId(room.getId());
        roomDTO.setName(room.getName());
        roomDTO.setNumberOfBed(room.getNumberOfBed());
        roomDTO.setPrice(room.getPrice());
        roomDTO.setEmpty(room.getFree());
        roomDTO.setBookingDateFrom(room.getBookingDateFrom());
        roomDTO.setBookingDateTo(room.getBookingDateTo());
        return roomDTO;
    }
}
