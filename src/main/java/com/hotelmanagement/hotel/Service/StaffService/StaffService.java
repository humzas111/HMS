package com.hotelmanagement.hotel.Service.StaffService;

import com.hotelmanagement.hotel.Entity.Room;
import com.hotelmanagement.hotel.Entity.Staff;

import java.util.List;

public interface StaffService {

    Staff save(Staff theStaff);
    List<Staff> findAll();
    Staff findById(int id);
    void deleteById(int id);
}
