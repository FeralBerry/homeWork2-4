package com.example.calculate;
public interface HomeServiceInterface {
    default String welcome(){
        return "Добро пожаловать в калькулятор";
    }
    String plus(int num1, int num2);
    String minus(int num1, int num2);
    String multiply(int num1, int num2);
    String divide(int num1, int num2);
}
