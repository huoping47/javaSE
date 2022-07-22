package com.huoping.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 *com.huoping.controller
 *霍平
 *2022/7/20 20 19:31
 */
@Controller
public class DateAction {
//    @RequestMapping("/date.action")
//    public String showDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date mydate) {//将接收到的日期注入给mydate
//        System.out.println(mydate);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String date = sdf.format(mydate);
//        System.out.println(date);
//        return "date";
//    }

    /**
     * 注册一个全局的日期处理
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

//    @RequestMapping("/date.action")
//    public String showDate(Date mydate, HttpServletRequest request) {//将接收到的日期注入给mydate
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String date = sdf.format(mydate);
//        System.out.println(date);
//        request.setAttribute("mydate", date);
//        return "date";
//    }

    @RequestMapping("/date.action")
    public String showDate(HttpServletRequest request) throws ParseException {//将接收到的日期注入给mydate
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Student student = new Student("zhangsan", sdf.parse("2001-4-1"));
        Student student2 = new Student("zhangsan", sdf.parse("2003-4-1"));
        Student student3 = new Student("zhangsan", sdf.parse("2002-4-1"));
        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        request.setAttribute("students", students);
        return "date";
    }
}
