package com.hotelmanagement.hotel.Service.GuestService;

import com.hotelmanagement.hotel.Entity.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestService {

    Guest save(Guest theGuest);

    List<Guest> findAll();

    Guest findById(int id);

    void deleteById(int id);

}
