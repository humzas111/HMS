package com.hotelmanagement.hotel.Controller;


import com.hotelmanagement.hotel.Entity.Room;
import com.hotelmanagement.hotel.Service.RoomService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }
    @PostMapping("/rooms")
    public Room addRoom(@RequestBody Room theRoom){
        Room dbRoom = roomService.save(theRoom);
        return dbRoom;
    }

    @GetMapping("/allrooms")
    public List<Room> findAll(){
        return roomService.findAll();
    }

    @GetMapping("/rooms/{id}")
public Room getRoom(@PathVariable int id){
        Room theRoom = roomService.findById(id);
        if(theRoom==null){
throw new RuntimeException("Room not found. "+ id);
        }
        return theRoom;
    }

    @PutMapping("/room")
    public Room updateRoom(@RequestBody Room theRoom){
        Room dbRoom = roomService.save(theRoom);
return dbRoom;
    }

    @DeleteMapping("/rooms/{id}")
    public String deleteRoom(@PathVariable int id){
        Room theRoom = roomService.findById(id);
        roomService.deleteById(id);
        return "Room Deleted: "+ id;
    }

}
