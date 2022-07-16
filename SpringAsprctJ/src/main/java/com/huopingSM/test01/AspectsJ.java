package com.huopingSM.test01;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 *com.huoping
 *霍平
 *2022/7/13 13 19:11
 */
@Aspect
@Component
public class AspectsJ {

    @Before(value = "execution(public String com.huopingSM.test01.SomeImpl.doSome(String,int))")
    public void doAspect() {
        System.out.println("切入执行中");
    }

    @AfterReturning(value = "execution(public * com.huopingSM.test01.SomeImpl.*(..))")
    public void AfterAspect() {
        System.out.println("后置通知切入");
    }
}
