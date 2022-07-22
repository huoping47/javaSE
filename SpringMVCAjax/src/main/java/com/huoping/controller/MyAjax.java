package com.huoping.controller;

import com.huoping.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/*
 *com.huoping.controller
 *霍平
 *2022/7/19 19 19:23
 */
@Controller
public class MyAjax {
    @RequestMapping("/list.action")
    @ResponseBody
    public List<Student> showStu() {
        List<Student> list = new ArrayList<>();
        Student student = new Student("张三", 15);
        Student student1 = new Student("李四", 21);
        Student student2 = new Student("老刘", 31);
        list.add(student1);
        list.add(student2);
        list.add(student);
        return list;
    }
}
