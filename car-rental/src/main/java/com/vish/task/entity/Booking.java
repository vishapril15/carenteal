package com.vish.task.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relations
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;   // Kisne booking ki

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;     // Konsi car book hui

    // Booking details
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;
}
