package thisclass.demo;

public class ThisTest {
    //实例变量
    int a = 10;
    public static void main(String[] args) {
        //实例变量不能直接访问，需要’引用.‘的方式访问
        // System.out.println(a);
        ThisClass tc = new ThisClass();
        tc.student(15);
        tc.student("张三");
        ThisClass tc1 = new ThisClass();
        tc1.student(31);
        tc1.student("李四");
        ThisClass tc2 = new ThisClass(21,"李雷");

        System.out.println(tc.name+"今年"+tc.age+"-------");
        System.out.println(tc2.name+"今年"+tc2.age);
        System.out.println(tc1.name+"今年"+tc1.age);


    }
    //ThisTest th = new ThisTest();调用该方法
    /*public int numInt(int a){
        return a;
    }*/
    //num();本类调用带有static的方法
    /*public static void num(){
        System.out.println("111");
    }*/
}
