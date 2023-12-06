package com.hotelmanagement.hotel.DAO;

import com.hotelmanagement.hotel.Entity.Room;
import com.hotelmanagement.hotel.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, Integer> {
}
