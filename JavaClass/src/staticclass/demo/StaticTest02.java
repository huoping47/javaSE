package staticclass.demo;

public class StaticTest02 {
    //静态代码块在类加载时执行，只执行一次，并且在一个类中可以编写多个，遵循自上而下的顺序执行
    static{
        System.out.println("我先执行");
    }
    static{
        System.out.println("我第二执行");
    }
    public static void main(String[] args) {
        System.out.println("张三");
    }
}
