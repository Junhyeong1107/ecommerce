package com.example.ecommerce.Controller;

import com.example.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.GetMapping;
import com.example.ecommerce.Entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(User user) {
        userService.registerNewUserAccount(user);
        return "redirect:/index"; // 회원가입 후 products 페이지로 리다이렉트
    }

    @GetMapping
    public String signupForm() {
        return "signup"; // signup.html을 렌더링
    }
}