package abstract_class.demo;

public class AbstractTest {
    public static void main(String[] args) {
        B b = new B();
//        A a = new A();//抽象类不能被实例化

    }
}
/*
银行账户类
 */
//银行的抽象类
abstract class A{
    public A() {
        super();
    }
    public A(String name){
        String sname = name;
        System.out.println(sname);
    }
//    public abstract  void C();//抽象方法
    public void sun(){
        System.out.println("这是抽象类父类的方法");
    }
}

class B extends A{
    public B() {
        //super();//调用父类的无参数构造方法
        super("zhangsan");//调用父类的有参数构造方法
        super.sun();
    }

}
