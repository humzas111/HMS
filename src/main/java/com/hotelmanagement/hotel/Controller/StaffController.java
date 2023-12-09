package com.hotelmanagement.hotel.Controller;


import com.hotelmanagement.hotel.Entity.Room;
import com.hotelmanagement.hotel.Entity.Staff;
import com.hotelmanagement.hotel.Service.RoomService.RoomService;
import com.hotelmanagement.hotel.Service.StaffService.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class StaffController {
    @Autowired
    private StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/allstaff")
    public List<Staff> getAllStaff(){
        return staffService.findAll();
    }

    @PostMapping("/addStaff")
    public Staff addStaff(@RequestBody Staff theStaff){
        Staff dbStaff = staffService.save(theStaff);
        return dbStaff;
    }

    @PutMapping("/staff")
    public Staff updateStaff(@RequestBody Staff theStaff){
        Staff dbRoom = staffService.save(theStaff);
        return dbRoom;
    }

    @DeleteMapping("/staffs/{id}")
    public String deleteStaff(@PathVariable int id){
        Staff theStaff = staffService.findById(id);
        staffService.deleteById(id);
        return "Staff Deleted: "+ id;
    }

}
