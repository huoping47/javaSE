package try_catch.demo;
import java.lang.*;

public class TryCatchTest01 {
    /*public static void main(String[] args) throws ClassNotFoundException {
        //报错原因是ClassNotFoundException是属于编译时异常，调用者在调用的时候必须预先处理此异常
        //第一种解决方式就是可以在方法声明的位置上继续使用throws继续上抛
//        doSome();
    }*/

    public static void main(String[] args) {
        //第二种处理方式，使用try..catch进行捕捉
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //
    public static void doSome() throws  ClassNotFoundException {
        System.out.println("doSome！！");
    }
}
