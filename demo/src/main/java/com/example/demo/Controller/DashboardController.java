package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    // // Buka dashboard.html saat akses root "/"
    // @GetMapping("/")
    // public String dashboard() {
    //     return "dashboard.html";
    // }

    // Buka index.html saat akses "/users"
    @GetMapping("/dashboard")
    public String users() {
        return "dashboard";
    }
}
