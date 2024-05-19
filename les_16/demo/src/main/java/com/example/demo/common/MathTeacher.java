package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}
