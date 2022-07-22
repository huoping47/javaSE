package com.huoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *com.huoping.controller
 *霍平
 *2022/7/20 20 18:32
 */
@Controller
public class OtherAction {
    @RequestMapping("/other.action")
    public String OtherActions() {
        System.out.println("ohter的action进来执行了...................");
        return "main";
    }


}
