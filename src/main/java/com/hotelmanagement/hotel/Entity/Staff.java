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
    private int staff_id;
    private String staff_name;
    private String staff_role;
}
