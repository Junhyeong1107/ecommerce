package com.example.ecommerce.Entity;


import lombok.Data;
import jakarta.persistence.*;;


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    // getters and setters
}
