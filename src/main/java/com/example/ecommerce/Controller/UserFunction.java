package com.example.ecommerce.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.ecommerce.Repository.UserRepository;
import java.util.Map;

@RestController
public class UserFunction {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/checkUserid")
    public ResponseEntity<?> checkUserid(@RequestParam String username) {
        boolean isAvailable = !userRepository.findByUsername(username).isPresent();
        return ResponseEntity.ok().body(Map.of("isAvailable", isAvailable));
    }

}
