package com.gmail.iikaliada.test.work.service.converter.impl;

import com.gmail.iikaliada.test.work.repository.model.Hotel;
import com.gmail.iikaliada.test.work.service.converter.HotelConverter;
import com.gmail.iikaliada.test.work.service.model.HotelDTO;
import org.springframework.stereotype.Component;

@Component
public class HotelConverterImpl implements HotelConverter {
    @Override
    public Hotel toHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        hotel.setId(hotelDTO.getId());
        hotel.setWorkingTimeFrom(hotelDTO.getWorkingTimeFrom());
        hotel.setWorkingTimeTo(hotelDTO.getWorkingTimeTo());
        return hotel;
    }
}
