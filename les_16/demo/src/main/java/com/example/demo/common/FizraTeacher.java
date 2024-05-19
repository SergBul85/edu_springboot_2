package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class FizraTeacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Пробежать 10 км";
    }
}
