package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class LaborTeacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Делать табуретки";
    }
}
