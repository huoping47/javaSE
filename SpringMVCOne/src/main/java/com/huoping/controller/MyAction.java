package com.huoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *com.huoping.controller
 *霍平
 *2022/7/18 18 19:15
 */
@Controller
public class MyAction {
    @RequestMapping(value = "/req.action", method = RequestMethod.GET)
    public String getGet() {
        System.out.println("get请求");
        return "main";
    }

    @RequestMapping(value = "/req.action", method = RequestMethod.POST)
    public String getPost() {
        System.out.println("POST请求");
        return "main";
    }
}
