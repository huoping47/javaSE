package final_class.demo;

public class MainTest {
    //实例变量必须在声明的时候赋值，因为实例变量声明时会有默认值
    //final int i ; 报错
    //解决方案：
    final int i =100;
    //第二种解决方案：在构造方法赋值
    final int d;
    public  MainTest(){
        this.d=100;
    }
    public static void main(String[] args) {
        int a = 100;
        a=200;
        final int c = 100;
        //c=120;   加了fina的变量c不可以再次赋值了

        B b = new B(10,"张三");
        b = new B(20,"李四");
        final B o = new B(20,"王五");
        o.setA(30);//final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指向的对象内部的内存是可以被修改的
        //o = new B(10,"王麻子");  final修饰的引用一旦指向某个对象之后，不能再指向其他对象
    }
}
