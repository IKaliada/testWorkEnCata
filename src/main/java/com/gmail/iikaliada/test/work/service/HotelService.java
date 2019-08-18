package com.gmail.iikaliada.test.work.service;

import com.gmail.iikaliada.test.work.service.model.HotelDTO;
import org.springframework.stereotype.Service;

@Service
public interface HotelService {

    void saveHotel(HotelDTO hotelDTO);
}
