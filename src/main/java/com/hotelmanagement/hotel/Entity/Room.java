package com.hotelmanagement.hotel.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "Room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private int roomId;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "room_rate")
    private int rate;

    @Column(name = "room_status")
    private String status;

    public Room() {
    }

}
