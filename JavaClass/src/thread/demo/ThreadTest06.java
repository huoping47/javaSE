package thread.demo;

/**
 * @author 霍平
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t= new Animal();
        t.setName("tt");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50) {
                t.start();
                Animal a = new Animal();
                //这中方式终止程序不会损失数据，建议使用这种方式
                a.starts = false;
            }
        }
    }
}
class Animal extends Thread{
    boolean starts;
    @Override
    public void run() {
        System.out.println("我开始啦");
        String name  =Thread.currentThread().getName();
        if (starts) {
            try {
                Thread.sleep(1000*5);
                System.out.println(name+"睡了五秒，然后线程结束了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println(name+"线程结束了");
        }
    }
}