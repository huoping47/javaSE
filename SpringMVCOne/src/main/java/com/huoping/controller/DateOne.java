package com.huoping.controller;

import com.huoping.TwoUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/*
 *com.huoping.controller
 *霍平
 *2022/7/18 18 20:42
 */
@Controller
public class DateOne {
    @RequestMapping(value = "/DateOne.action", method = RequestMethod.POST)
    public String one(String name, int age) {
        System.out.println(name + age);
        return "main";
    }

    @RequestMapping(value = "/DateTwo.action", method = RequestMethod.POST)
    public String two(TwoUser tu) {
        System.out.println(tu);
        return "main";
    }

    @RequestMapping(value = "/three/{uname}/{age}.action")
    public String three(@PathVariable("uname") String name, @PathVariable int age) {
        System.out.println(name + age);
        return "main";
    }

    @RequestMapping(value = "/four.action")
    public String four(@RequestParam("name") String uname, @RequestParam("age") int uage) {
        System.out.println(uname + uage);
        return "main";
    }

    @RequestMapping(value = "/five.action")
    public String five(HttpServletRequest request) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name + age);
        return "main";
    }
}
