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
    private int room_id;

    @Column(name = "room_type")
    private String room_Type;

    @Column(name = "room_rate")
    private int room_rate;

    @Column(name = "room_status")
    private String room_status;

    public Room() {
    }

}
