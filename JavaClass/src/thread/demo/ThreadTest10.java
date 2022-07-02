package thread.demo;

/**
 * @author 霍平
 * @date 2022/6/4 18:16
 * @mouse 六月
 */

public class ThreadTest10 {
    public static void main(String[] args) {
        Sys s = new Sys();
        Thread t = new ThreadSys(s);
        Thread t1 = new ThreadSys(s);
        t.setName("t");
        t1.setName("t1");
        t.start();
        t1.start();
    }
}
class ThreadSys extends Thread{
    private Sys sys;
    public ThreadSys(Sys sys) {
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
class Sys{
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
    //因为doOther不是synchronized修饰的，所以不需要去找这个锁，可以直接运行
    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}