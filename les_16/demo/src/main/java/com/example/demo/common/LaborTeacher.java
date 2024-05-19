package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LaborTeacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Делать табуретки";
    }
}
