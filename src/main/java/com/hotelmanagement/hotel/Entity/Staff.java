package com.hotelmanagement.hotel.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int staffId;
    private String name;
    private String role;
    private String email;
    private int phone;


}
