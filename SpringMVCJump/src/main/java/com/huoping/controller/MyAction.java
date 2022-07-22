package com.huoping.controller;

import com.huoping.poji.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/*
 *com.huoping.controller
 *霍平
 *2022/7/20 20 18:24
 */
@Controller
public class MyAction {
    @RequestMapping("/one.action")
    public String oneAction() {
        System.out.println("请求转发页面");
        return "main"; //默认使用视图解析器进行拼接前缀后缀进行跳转
    }

    @RequestMapping("/two.action")
    public String twoAction() {
        System.out.println("请求转发action");
        //  /admin  /two.action   .jsp
        //forward:可以屏蔽前缀和后缀的拼接
        return "forward:/other.action";
    }


    @RequestMapping("/three.action")
    public String threeAction() {
        System.out.println("重定向跳转页面");
        //  /admin  /two.action   .jsp
        //redirect:可以屏蔽前缀和后缀的拼接,需要跳转到main页面,所以必须把路径写全
        return "redirect:/admin/main.jsp";
    }


    @RequestMapping("/four.action")
    public String fourAction() {
        System.out.println("重定向跳转页面");
        //  /admin  /two.action   .jsp
        //redirect:可以屏蔽前缀和后缀的拼接,需要跳转到main页面,所以必须把路径写全
        return "redirect:/other.action";
    }

    @RequestMapping("five.action")
    public String fiveAction(
            HttpServletRequest request,
            HttpServletResponse response,
            HttpSession session,
            Model model, Map map,
            ModelMap modelMap) {
        Users users = new Users("张三", 21);
        request.setAttribute("requestUsers", users);
        session.setAttribute("sessionUsers", users);
        model.addAttribute("modelUsers", users);
        map.put("mapUsers", users);
        modelMap.addAttribute("modelMapUsers", users);
        return "main";
    }
}
