package try_catch.demo;
/*
自定义一个异常
    第一步：需要继承所有异常的父类
    第二部：写一个无参数和有参数的构造方法
 */
public class TryCatchTest06  extends Exception{
    public TryCatchTest06(){

    }
    public TryCatchTest06(String s ){
        super(s);
    }
}
