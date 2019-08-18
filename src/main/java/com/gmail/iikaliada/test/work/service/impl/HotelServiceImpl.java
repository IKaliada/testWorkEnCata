package com.gmail.iikaliada.test.work.service.impl;

import com.gmail.iikaliada.test.work.repository.HotelRepository;
import com.gmail.iikaliada.test.work.repository.model.Hotel;
import com.gmail.iikaliada.test.work.service.HotelService;
import com.gmail.iikaliada.test.work.service.converter.HotelConverter;
import com.gmail.iikaliada.test.work.service.model.HotelDTO;
import org.springframework.stereotype.Component;

@Component
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    private final HotelConverter hotelConverter;

    public HotelServiceImpl(HotelRepository hotelRepository, HotelConverter hotelConverter) {
        this.hotelRepository = hotelRepository;
        this.hotelConverter = hotelConverter;
    }

    @Override
    public void saveHotel(HotelDTO hotelDTO) {
        Hotel hotel = hotelConverter.toHotel(hotelDTO);
        hotelRepository.save(hotel);
    }
}
