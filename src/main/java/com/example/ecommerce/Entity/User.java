package com.example.ecommerce.Entity;


import lombok.Data;
import jakarta.persistence.*;;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userid;
    private String username;
    private String password;
}
