package com.hotelmanagement.hotel.DAO;

import com.hotelmanagement.hotel.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepo extends JpaRepository<Room, Integer> {
}
