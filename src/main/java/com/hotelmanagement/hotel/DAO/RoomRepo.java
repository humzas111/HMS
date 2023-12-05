package com.hotelmanagement.hotel.DAO;

import com.hotelmanagement.hotel.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoomRepo extends JpaRepository<Room, Integer> {
}
