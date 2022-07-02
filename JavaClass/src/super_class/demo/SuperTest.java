package super_class.demo;

public class SuperTest {
    public static void main(String[] args) {
        new b();
    }
}
class a{
    public a(){
        System.out.println("a类的无参数构造方法");
    }
    public a(int a,String name){

    }
    /*
    this()的用法，在方法中调用
     */
    /*public  void d(){
        this.c();
    }
    public  void c(){
        this.d();
    }*/
}
/*
 */
class b extends a{
    public b(){
        //super();  //调用父类的无参数构造方法
        super(10,"zhangsan ");//调用父类的有参数构造方法
        System.out.println("b类的无参构造方法");
    }
}
