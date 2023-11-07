package com.example.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if(checkNull(num1) && checkNull(num2)){
            double res = Double.parseDouble(num1) + Double.parseDouble(num2);
            return String.valueOf(res);
        }
        return "1 из параметров не введен";

    }
    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if(checkNull(num1) && checkNull(num2)) {
            double res = Double.parseDouble(num1) - Double.parseDouble(num2);
            return String.valueOf(res);
        }
        return "1 из параметров не введен";
    }
    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if(checkNull(num1) && checkNull(num2)) {
            double res = Double.parseDouble(num1) * Double.parseDouble(num2);
            return String.valueOf(res);
        }
        return "1 из параметров не введен";
    }
    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        if(checkNull(num1) && checkNull(num2)) {
            if(Integer.parseInt(num2) != 0){
                double res = Double.parseDouble(num1) / Double.parseDouble(num2);
                return String.valueOf(res);
            }
            return "Делить на 0 нельзя";
        }
        return "1 из параметров не введен";
    }
    private Boolean checkNull(String str){
        if (str == null){
            return false;
        }
        return true;
    }
}
