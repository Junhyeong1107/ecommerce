package com.example.ecommerce.Repository;

import com.example.ecommerce.Entity.Product;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);
}

