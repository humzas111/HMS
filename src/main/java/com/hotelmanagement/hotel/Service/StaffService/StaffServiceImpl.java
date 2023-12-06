package com.hotelmanagement.hotel.Service.StaffService;

import com.hotelmanagement.hotel.DAO.RoomRepo;
import com.hotelmanagement.hotel.DAO.StaffRepo;
import com.hotelmanagement.hotel.Entity.Staff;
import com.hotelmanagement.hotel.Service.StaffService.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepo staffRepo;

    public StaffServiceImpl(StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
    }


    @Override
    public Staff save(Staff theStaff) {
        return staffRepo.save(theStaff);
    }

    @Override
    public List<Staff> findAll() {
        return staffRepo.findAll();
    }

    @Override
    public Staff findById(int id) {
        Optional<Staff> result = staffRepo.findById(id);
        Staff theStaff = null;
        if(result.isPresent()){
            theStaff = result.get();
        }
        else{
            throw new RuntimeException("Didn't find the Staff!!");
        }

        return theStaff;
    }

    @Override
    public void deleteById(int id) {
        staffRepo.deleteById(id);
    }
}

