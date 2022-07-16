package com.huopingSM.test02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*
 *com.huoping.test02
 *霍平
 *2022/7/14 14 18:20
 */
@Aspect
@Component
public class AsprctsJ {
    @AfterReturning(value = "execution(public * com.huopingSM.test02.StudentImpl.students(..))", returning = "obj")
    public void doSomeAs(Object obj) {
        System.out.println("后置通知执行......");
        Students s = (Students) obj;
        System.out.println(s.getName() + "---aaaaa");
        s.setName("李四");
        System.out.println(s.getName() + "---aspect");
    }


}
