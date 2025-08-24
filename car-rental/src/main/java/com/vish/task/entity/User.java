package com.vish.task.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data   // ✅ ye annotation automatic getter, setter, toString, equals, hashCode sab bana dega
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}
