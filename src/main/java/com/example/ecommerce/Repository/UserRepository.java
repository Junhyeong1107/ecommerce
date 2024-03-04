package com.example.ecommerce.Repository;

import com.example.ecommerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
   
}
