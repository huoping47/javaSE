package org.example.service.impl;

import org.example.service.Show;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 *org.example.service.impl
 *霍平
 *2022/7/4 04 10:43
 */

//public class action implements Show {
public class action {

    @before
    public void before() {
        
    }

    public Show show;

    /**
     * 面向接口编程
     *
     * @param show
     */
    public action(Show show) {
        this.show = show;
    }

//    @Override

    /*
      静态代理模式,只能够通过代理访问目标对象,而且需求只能够是目标对象完成
     */
//    public void showTime() {
//        System.out.println("正在预约时间....");
//        System.out.println("正在预约场地....");
//        show.showTime();
//        System.out.println("正在结算费用....");
//    }

    /*
     * 动态代理模式设计
     */
    public Object getShow() {
        return Proxy.newProxyInstance(
                show.getClass().getClassLoader(), //类加载器,完成目标对象的加载
                show.getClass().getInterfaces(),//目标对象实现的所有接口
                new InvocationHandler() {//实现代理功能的接口,我们传入的是匿名内部类实现
                    @Override
                    public Object invoke(
                            Object proxy,//创建代理对象
                            Method method,//method就是目标方法,show()
                            Object[] args //目标方法的参数
                    ) throws Throwable {
                        System.out.println("正在预约时间.....");//代理功能
                        System.out.println("正在预约场地.....");
                        Object obj = method.invoke(show, args);//目标对象主业务功能的实现
                        System.out.println("正在结算费用.....");//代理功能
                        return obj;  //目标方法的返回值
                    }
                });
    }

}
