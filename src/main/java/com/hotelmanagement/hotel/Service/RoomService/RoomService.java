package com.hotelmanagement.hotel.Service.RoomService;

import com.hotelmanagement.hotel.Entity.Room;

import java.util.List;

public interface RoomService {

    Room save(Room theRoom);
    List<Room> findAll();
    Room findById(int id);
    void deleteById(int id);
}
