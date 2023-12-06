package com.hotelmanagement.hotel.Service.GuestService;

import com.hotelmanagement.hotel.DAO.GuestRepo;
import com.hotelmanagement.hotel.Entity.Guest;

import java.util.List;
import java.util.Optional;

public class GuestServiceImpl implements GuestService{

    private GuestRepo guestRepo;

    @Override
    public Guest save(Guest theGuest) {
        return guestRepo.save(theGuest);
    }

    @Override
    public List<Guest> findAll() {
        return guestRepo.findAll();
    }

    @Override
    public Guest findById(int id) {
        Optional<Guest> result = guestRepo.findById(id);
        Guest theGuest = null;

        if(result.isPresent()){
            theGuest = result.get();
        }
        else {
            throw new RuntimeException("Guest not found!");
        }

        return theGuest;
    }

    @Override
    public void deleteById(int id) {
        guestRepo.deleteById(id);
    }

}
