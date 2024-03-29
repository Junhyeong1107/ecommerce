package com.example.ecommerce.Controller;

import com.example.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecommerce.Entity.Product;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productService.findAllProducts();
        model.addAttribute("products", products); // 모델에 products를 담아서 뷰로 전달
        return "index"; // 타임리프 템플릿 이름
    }

    @GetMapping("/product-detail/{id}")
    public String productDetail(Model model, @PathVariable("id") Long id) {
        Product product = productService.findProductById(id);
        model.addAttribute("product", product);
        return "product-detail";
    }

    @GetMapping("/test/pd")
    @ResponseBody
    public List<Product> listProducts() {
        return productService.findAllProducts();
    }
    
    
}
