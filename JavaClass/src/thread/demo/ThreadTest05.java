package thread.demo;

/**
 * @author 霍平
 */

public class ThreadTest05 {
    public static void main(String[] args) {
        //sleep方法
        Thread t = new Thread(new ser());
        t.setName("t");
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.interrupt();//终止程序的睡眠，唤醒程序,让对方的程序直接失效
    }
}
class ser extends Thread{
    @Override
    public void run() {
        System.out.println("begin");
        try {
            Thread.sleep(1000*6);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
        //当前线程的名字
        System.out.println(Thread.currentThread().getName()+"-->"+"end");
    }
}