package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MathTeacher implements Teacher {

    public MathTeacher() {

        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

//    @PostConstruct
//    public void myFirstMethod(){
//        System.out.println("myFirstMethod");
//    }
//
//    @PreDestroy
//    public void myLastMethod(){
//        System.out.println("myLastMethod");
//    }

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}
