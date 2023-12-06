package com.hotelmanagement.hotel.DAO;

import com.hotelmanagement.hotel.Entity.Guest;
import com.hotelmanagement.hotel.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepo extends JpaRepository<Guest, Integer> {
}
