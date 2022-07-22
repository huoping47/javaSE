package com.huoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/*
 *com.huoping.controller
 *霍平
 *2022/7/21 21 18:52
 */
@Controller
public class MyWebInf {
    @RequestMapping("/index")
    public String myIndex() {
        return "index";
    }

    @RequestMapping("/admin")
    public String myMain() {
        return "admin";
    }

    @RequestMapping("showLogin")
    public String showLogin() {
        return "login";
    }

    //登录的业务判断
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request) {
        if ("huoping".equalsIgnoreCase(name) && "123".equalsIgnoreCase(pwd)) {
            request.getSession().setAttribute("userName", name);
            return "admin";
        } else {
            request.setAttribute("msg", "用户名或者密码错误");
            return "login";
        }
    }
}
