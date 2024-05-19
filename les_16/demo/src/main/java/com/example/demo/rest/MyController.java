package com.example.demo.rest;

import com.example.demo.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private Teacher teacher;

    @Autowired
    public MyController(@Qualifier("mathTeacher") Teacher teacher) {

        this.teacher = teacher;
    }

//    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    @GetMapping("/homework")
    public String getHomeWork() {

        return teacher.getHomeWork();
    }


}
