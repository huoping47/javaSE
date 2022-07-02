package thread.demo;

/**
 * @author 霍平
 * @date 2022/6/4 18:56
 * @mouse 六月
 */

public class ThreadTest13 {
    public static void main(String[] args) {
        //死锁
    Object o = new Object();
    Object o1 = new Object();
    Thread t = new Thre(o,o1);
    Thread t1 = new Thre1(o,o1);
    t.start();
    t1.start();
    }
}
class Thre extends Thread{
    Object o1;
    Object o2;
    public Thre(Object o1,Object o2){
        this.o1=o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o2) {

            }
        }
    }
}
class Thre1 extends Thread{
    Object o1;
    Object o2;
    public Thre1(Object o1,Object o2){
        this.o1=o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o1) {

            }
        }
    }
}