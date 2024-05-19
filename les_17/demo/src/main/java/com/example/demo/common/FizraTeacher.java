package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class FizraTeacher implements Teacher {

    public FizraTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Пробежать 10 км";
    }
}
