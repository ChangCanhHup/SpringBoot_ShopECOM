package com.ecom.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartController {

    @GetMapping("/giohang.html")
    public String showShoppingCart() {
        // Add your logic here
        return "giohang"; // This should be the name of your Thymeleaf template
    }
}