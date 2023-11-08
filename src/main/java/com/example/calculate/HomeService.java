package com.example.calculate;

import org.springframework.stereotype.Service;

@Service
public class HomeService implements HomeServiceInterface{
    public String plus(int num1, int num2){
        return String.valueOf(num1 + num2);
    }
    public String minus(int num1, int num2){
        return String.valueOf(num1 - num2);
    }
    public String multiply(int num1, int num2){
        return String.valueOf(num1 * num2);
    }
    public String divide(int num1, int num2){
        if(num2 != 0){
            return String.valueOf(num1 / num2);
        }
        return "На 0 делить нельзя";
    }
}
