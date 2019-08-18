package com.gmail.iikaliada.test.work.service.converter;

import com.gmail.iikaliada.test.work.repository.model.Hotel;
import com.gmail.iikaliada.test.work.service.model.HotelDTO;

public interface HotelConverter {
    Hotel toHotel(HotelDTO hotelDTO);
}
