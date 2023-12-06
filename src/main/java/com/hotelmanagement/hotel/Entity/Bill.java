package com.hotelmanagement.hotel.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id") //id
    private int bill_Id;

    @Column(name = "bill_amount")
    private int bill_amount;

    @Column(name = "bill_status")
    private String bill_status;

    @OneToOne
    @JoinColumn(name = "res_id", nullable = false)
    private Reservation reservation;

}
