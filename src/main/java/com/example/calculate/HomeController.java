package com.example.calculate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        String title = "Добро пожаловать в калькулятор";
        model.addAttribute("title", title);
        return "home";
    }
}
