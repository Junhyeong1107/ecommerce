package com.example.ecommerce.Controller;

import com.example.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.GetMapping;
import com.example.ecommerce.Entity.User;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String registerUser(User user) {
        userService.registerNewUserAccount(user);
        return "redirect:/signup?success"; // 회원가입 후 products 페이지로 리다이렉트
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "signup"; // signup.html을 렌더링
    }
    @GetMapping("/login")
    public String loginForm() {
        return "login"; // login.html을 렌더링
    }
}