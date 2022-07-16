package com.huopingSM.test03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*
 *com.huoping.test03
 *霍平
 *2022/7/14 14 19:31
 */
@Aspect
@Component
public class MyAspect {
    //环绕通知
    @Around(value = "execution(public  * com.huopingSM.test03.DoSomeImpl.doSome(..))")
    public Object some(ProceedingJoinPoint pjp) throws Throwable {//ProceedingJoinPoint目标方法
        System.out.println("环绕通知前切功能实现");
        Object proceed = pjp.proceed(pjp.getArgs());
        System.out.println(proceed + "=目标方法的返回值");
        System.out.println("环绕通知后置功能实现");
        return proceed.toString().toUpperCase();
    }
}
