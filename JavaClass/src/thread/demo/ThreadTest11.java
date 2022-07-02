package thread.demo;

/**
 * @author 霍平
 * @date 2022/6/4 18:25
 * @mouse 六月
 */

public class ThreadTest11 {
    public static void main(String[] args) {
        Sys1 s1 = new Sys1();
        Thread t = new ThreadSys1(s1);
        Thread t1 = new ThreadSys1(s1);
        t.setName("t");
        t1.setName("t1");
        t.start();
        t1.start();
    }
}
class ThreadSys1 extends Thread{
    private Sys1 sys;
    public ThreadSys1(Sys1 sys) {
        this.sys = sys;
    }

    @Override
    public void run() {
        if ("t1".equals(Thread.currentThread().getName())) {
            sys.doOther();
        }else{
            sys.doSome();
        }
    }
}
class Sys1{
    //synchronized在实例方法中表示是this这个锁
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("doSome over");
    }
    //因为两个方法都有synchronized这个修饰，所以当doSome执行的时候
    // 另外一个线程进来执行doOther这个方法的时候会先找锁，找到了这个锁发现上面的代码还没执行完就会等上面的代码执行完
    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}