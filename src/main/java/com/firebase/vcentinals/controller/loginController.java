package com.firebase.vcentinals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
    @GetMapping("/login")
    public String loginPage() {
        return "login";  // Name of the Thymeleaf template
    }
    @GetMapping("/home")
    public String HomePage() {
        return "home";  // Name of the Thymeleaf template
    }
}
