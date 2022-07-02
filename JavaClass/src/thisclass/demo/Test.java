package thisclass.demo;

public class Test {
    //方法调用练习
    public static void method1(){
        Test.doSome();
        doSome();
        Test t = new Test();
        t.doOther();
        int c = t.i;
        System.out.println(t.i);
        System.out.println(c);
        System.out.println("method1"+"调用完毕"+"\n");
    }
    //实例方法
    public void method2(){
        Test.doSome();
        doSome();
        this.doOther();
        doOther();
        Test t = new Test();
        System.out.println(t.i);
        System.out.println(this.i);
        System.out.println("method2"+"调用完毕"+"\n");

    }
    public static void main(String[] args) {
        Test.method1();
        method1();
        Test t = new Test();
        t.method2();
    }
    int i= 10;
    public static void doSome(){
        System.out.println("doSome");
    }
    //实例方法
    public void doOther(){
        int a =0;
        a++;
        System.out.println("doOther"+a);
    }
}
