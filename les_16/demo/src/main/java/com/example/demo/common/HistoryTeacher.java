package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements Teacher{
    @Override
    public String getHomeWork() {
        return "Учить историю 15 века";
    }
}
