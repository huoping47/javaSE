package try_catch.demo;

import java.io.FileNotFoundException;

/*
异常捕捉中的两个重要的方法
    Exception.getMessage();获取异常简单的描述信息
    Exception.printStackTrace() ;打印异常追踪的堆栈信息
 */
public class TryCatchTest03 {
    public static void main(String[] args) {
        FileNotFoundException nullPointerException = new FileNotFoundException("空指针异常");

        //获取异常简单描述信息：这个信息实际上就是构造方法上面String参数
        //输出空指针异常
        String msg = nullPointerException.getMessage();
//        System.out.println(msg);

        //打印异常堆栈信息java.io.FileNotFoundException: 空指针异常
        //	at try_catch.demo.TryCatchTest03.main(TryCatchTest03.java:12)
        nullPointerException.printStackTrace();

    }
}
