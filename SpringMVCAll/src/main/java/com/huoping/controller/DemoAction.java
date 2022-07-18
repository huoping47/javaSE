package com.huoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *com.huoping.controller
 *霍平
 *2022/7/17 17 19:39
 */
@Controller
public class DemoAction {
    @RequestMapping(value = "/demo.action")
    public String demo() {
        System.out.println("服务器被访问到了");
        return "main";
    }
}
