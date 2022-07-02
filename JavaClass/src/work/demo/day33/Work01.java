package work.demo.day33;

/**
 * @author 霍平
 * @date 2022/6/4 12:02
 * @mouse 六月
 */

public class Work01 {
    public static void main(String[] args) {
        //模拟售票的情形,使用Thread的数据是共享的
        Thread t = new Titlk();
        t.setName("t");
        t.start();
        Thread t1 = new Titlk();
        t1.setName("t1");
        t1.start();
        Thread t2 = new Titlk();
        t2.setName("t2");
        t2.start();
    }
}
class Titlk extends Thread{
    static int piao = 10;
    @Override
    public void run() {
        while (piao>0){
            piao--;
            System.out.println(Thread.currentThread().getName()+"售出了"+piao);
        }
    }
}