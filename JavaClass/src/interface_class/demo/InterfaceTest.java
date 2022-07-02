package interface_class.demo;

public class InterfaceTest {
    public static void main(String[] args) {
//        C c = new C();接口不能被实例化
        System.out.println(C.a);
    }
}
//接口    A
interface A{

}
//接口的单继承
interface B {

}
//接口的多继承
interface C extends A,B{
    static final int a = 100;//常量
    int b = 100;//常量中的static final也可以省略
//    public abstract void num();//抽象类
//    void num1();//public abstract可以省略
}