package com.gmail.iikaliada.test.work.web.controller;

import com.gmail.iikaliada.test.work.service.HotelService;
import com.gmail.iikaliada.test.work.service.model.HotelDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/admin/hotel")
    public String getHotelPage(HotelDTO hotelDTO, Model model) {
        model.addAttribute("hotel", hotelDTO);
        return "hotel";
    }

    @PostMapping("/admin/hotel")
    public String saveHotel(@ModelAttribute("hotel") HotelDTO hotelDTO) {
        hotelService.saveHotel(hotelDTO);
        return "redirect:/admin";
    }
}
