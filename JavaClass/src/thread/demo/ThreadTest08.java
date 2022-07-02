package thread.demo;

/**
 * @author 霍平
 * @date 2022/6/4 15:10
 * @mouse 六月
 */

public class ThreadTest08 {
    public static void main(String[] args) {
        //让位的方法运用
        Thread t = new Thread(new Way());
        t.setName("t");
        Thread.yield();
        t.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
class Way implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}