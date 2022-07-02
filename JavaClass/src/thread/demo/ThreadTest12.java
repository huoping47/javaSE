package thread.demo;

/**
 * @author 霍平
 * @date 2022/6/4 18:32
 * @mouse 六月
 */

public class ThreadTest12 {
    public static void main(String[] args) {
        Sys2 s1 = new Sys2();
        Sys2 s2 = new Sys2();
        Thread t = new ThreadSys2(s1);
        Thread t1 = new ThreadSys2(s2);
        t.setName("t");
        t1.setName("t1");
        t.start();
        t1.start();
    }
}
class ThreadSys2 extends Thread{
    private Sys2 sys;
    public ThreadSys2(Sys2 sys) {
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
class Sys2{
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
    //虽然两个方法都有synchronized这个修饰，但是两个对象不同，所以不会等待上面的代码执行，各自执行各自的，一个对象一把锁，两个对象两把锁
    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
