package com.hotelmanagement.hotel.Controller;


import com.hotelmanagement.hotel.Entity.Guest;
import com.hotelmanagement.hotel.Service.GuestService.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class GuestController {
    @Autowired
    private GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping("/allGuest")
    public List<Guest> getAllStaff(){
        return guestService.findAll();
    }

    @PostMapping("/addGuest")
    public Guest addStaff(@RequestBody Guest theGuest){
        Guest dbGuest = guestService.save(theGuest);
        return dbGuest;
    }

    @PutMapping("/Guest")
    public Guest updateStaff(@RequestBody Guest theGuest){
        Guest dbGuest = guestService.save(theGuest);
        return dbGuest;
    }

    @DeleteMapping("/staffs/{id}")
    public String deleteStaff(@PathVariable int id){
        Guest theGuest = guestService.findById(id);
        guestService.deleteById(id);
        return "Guest Deleted: "+ id;
    }

}
