package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}
