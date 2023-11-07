package com.example.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int res = num1 + num2;
        return "Сумма равна: " + res;
    }
    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int res = num1 - num2;
        return "Разница равна: " + res;
    }
    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int res = num1 * num2;
        return "Разница равна: " + res;
    }
    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        if(num2 != 0){
            int res = num1 / num2;
            return "Разница равна: " + res;
        }
        return "Делить на 0 нельзя";
    }
}
