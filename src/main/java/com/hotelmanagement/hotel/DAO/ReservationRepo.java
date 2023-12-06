package com.hotelmanagement.hotel.DAO;

import com.hotelmanagement.hotel.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Room, Integer> {
}
