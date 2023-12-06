package com.hotelmanagement.hotel.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Guest")
public class Guest {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id")
    private int guest_id;

    @Column(name = "guest_name")
    private String guest_name;

    @Column(name = "guest_email")
    private String guest_email;

    @Column(name = "guest_phone")
    private String guest_phone;

    @Column(name = "guest_address")
    private String guest_address;
}
