package com.example.demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MathTeacher implements Teacher {

    public MathTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}
