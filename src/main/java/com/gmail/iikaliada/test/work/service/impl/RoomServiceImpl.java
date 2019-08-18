package com.gmail.iikaliada.test.work.service.impl;

import com.gmail.iikaliada.test.work.repository.RoomRepository;
import com.gmail.iikaliada.test.work.repository.model.Room;
import com.gmail.iikaliada.test.work.service.RoomService;
import com.gmail.iikaliada.test.work.service.converter.RoomConverter;
import com.gmail.iikaliada.test.work.service.model.RoomDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomConverter roomConverter;

    public RoomServiceImpl(RoomRepository roomRepository, RoomConverter roomConverter) {
        this.roomRepository = roomRepository;
        this.roomConverter = roomConverter;
    }

    @Override
    @Transactional
    public void createRoom(RoomDTO roomDTO) {
        Room room = roomConverter.toRoom(roomDTO);
        room.setId(UUID.randomUUID().toString());
        room.setEmpty(true);
        roomRepository.save(room);
    }

    @Override
    @Transactional
    public List<RoomDTO> getRooms() {
        List<Room> rooms = roomRepository.findAll();
        return rooms.stream()
                .map(roomConverter::fromRoom)
                .collect(Collectors.toList());
    }

    @Override
    public void bookRoom(RoomDTO roomDTO) {
        Room room = roomRepository.findRoomById(roomDTO.getId());
        if (!room.getFree()) {
            updateFields(roomDTO, room);
            roomRepository.save(room);
        }else {

        }
    }

    @Override
    public RoomDTO getRoomById(String id) {
        Room room = roomRepository.findRoomById(id);
        return roomConverter.fromRoom(room);
    }

    private void updateFields(RoomDTO roomDTO, Room room) {
        room.setId(roomDTO.getId());
        room.setPrice(roomDTO.getPrice());
        room.setNumberOfBed(roomDTO.getNumberOfBed());
        room.setName(roomDTO.getName());
        room.setBookingDateFrom(roomDTO.getBookingDateFrom());
        room.setBookingDateTo(roomDTO.getBookingDateTo());
        room.setEmpty(false);
    }
}
