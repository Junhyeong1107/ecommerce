package com.example.ecommerce.Controller;

import com.example.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.findAllProducts());
        return "index"; // 타임리프 템플릿 이름
    }
    @GetMapping("/products/{id}")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
