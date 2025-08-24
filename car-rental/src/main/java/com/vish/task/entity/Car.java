package com.vish.task.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity                 // ye batata hai ki ye database table hai
@Data                   // Lombok se getter/setter, toString ban jayega
@NoArgsConstructor      // default constructor
@AllArgsConstructor     // parameterized constructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;     // Primary Key (auto increment)

    private String brand;
    private String model;
    private String type;   // SUV, Sedan, Hatchback etc.
    private double pricePerDay;
    private boolean available = true;  // Default available true rakha
}
