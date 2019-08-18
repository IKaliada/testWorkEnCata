package com.gmail.iikaliada.test.work.web.controller;

import com.gmail.iikaliada.test.work.service.RoomService;
import com.gmail.iikaliada.test.work.service.model.RoomDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/admin/room")
    public String getRoomPage(RoomDTO roomDTO, Model model) {
        model.addAttribute("room", roomDTO);
        return "room";
    }

    @PostMapping("/admin/room")
    public String createRoom(@ModelAttribute("room") RoomDTO roomDTO) {
        roomService.createRoom(roomDTO);
        return "redirect:/admin";
    }

    @GetMapping("/user/rooms")
    public String getEmptyRooms(Model model) {
        List<RoomDTO> rooms = roomService.getRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

    @GetMapping("/user/rooms/{id}")
    public String showPageForBookingRoom(@PathVariable("id") String id, Model model) {
        RoomDTO roomDTO = roomService.getRoomById(id);
        model.addAttribute("room", roomDTO);
        return "book";
    }

    @PostMapping("/user/rooms/book")
    public String bookRoom(@ModelAttribute("room") RoomDTO roomDTO) {
        roomService.bookRoom(roomDTO);
        return "redirect:/user/rooms";
    }
}
