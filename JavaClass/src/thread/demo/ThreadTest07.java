package thread.demo;

/**
 * @author 霍平
 * @date 2022/6/4 14:50
 * @mouse 六月
 */

public class ThreadTest07 {
    public static void main(String[] args) {
//        线程优先级的方法运用
        Thread t = new Thread(new Animals());
        t.setName("t");
        //设置线程的优先级
        t.setPriority(8);
        System.out.println(t.getPriority());
        t.start();
        Thread t1 = new Thread(new Animals());
        t1.setName("t1");
        //设置线程的优先级
        t1.setPriority(3);
//        获取线程的优先级
        System.out.println(t1.getPriority());
        t1.start();
    }
}
class Animals implements Runnable{
    static int a = 100;
    @Override
    public void run() {
        for (int i = 0; i < a; i++) {
            a--;
            System.out.println(Thread.currentThread().getName()+"--->"+a);
        }
    }
}