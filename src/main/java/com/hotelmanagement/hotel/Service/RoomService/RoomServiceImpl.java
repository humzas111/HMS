package com.hotelmanagement.hotel.Service.RoomService;

import com.hotelmanagement.hotel.DAO.RoomRepo;
import com.hotelmanagement.hotel.Entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    private RoomRepo roomRepo;

    @Autowired
    public RoomServiceImpl(RoomRepo roomRepo) {
        this.roomRepo = roomRepo;
    }

    @Override
    public  Room save(Room theRoom){
       return roomRepo.save(theRoom);
    }

    @Override
    public List<Room> findAll() {
        return roomRepo.findAll();
    }

    @Override
    public Room findById(int id) {
        Optional<Room> result = roomRepo.findById(id);
        Room theRoom = null;

        if(result.isPresent()){
            theRoom = result.get();
        }
        else{
throw new RuntimeException("Didn't find the Room: "+id);
        }

        return theRoom;
    }

    @Override
    public void deleteById(int id) {
          roomRepo.deleteById(id);
    }


}
