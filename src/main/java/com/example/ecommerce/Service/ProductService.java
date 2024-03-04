package com.example.ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.Entity.Product;
import com.example.ecommerce.Repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Autowired
    public Product getProductById(Long id) {
        // findById 사용 및 Optional 결과 처리
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            return product.get();
        } else {
            // 제품을 찾지 못한 경우 처리
            // 예외를 던지거나 다른 에러 처리 로직을 구현
            throw new EntityNotFoundException("Product not found with id: " + id);
        }
    }
}
