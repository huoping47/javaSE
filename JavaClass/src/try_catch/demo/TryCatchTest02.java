package try_catch.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class TryCatchTest02 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        //报错，调用m3方法中有throws上抛的异常，如果调用就需要处理这个异常
        //如果还继续上抛，就会一直解决不了，直到抛到java的JVM中，JVM直接报错

        //如果不想继续给调用者处理，可以使用 try..catch捕捉异常，调用者就不会知道，和处理这个异常，因为这个异常已经
        //被我们捕捉到了，处理了
        try {
            m3();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m3() throws FileNotFoundException {
        //报错，是因为FileInputStream这个类中有thorws上抛的异常，谁调用，谁就需要处理这个异常
        //解决方案，继续上抛，给调用者处理
        new FileInputStream("sssss");
    }
}
