package work.demo.day34;

/**
 * @author 霍平
 * @date 2022/6/4 21:11
 * @mouse 六月
 *
1、使用生产者和消费者模式实现，交替输出：
假设只有两个线程，输出以下结果：
t1-->1
t2-->2
t1-->3
t2-->4
t1-->5
t2-->6
....

要求：必须交替，并且t1线程负责输出奇数。t2线程负责输出偶数。
两个线程共享一个数字，每个线程执行时都要对这个数字进行：++

 */

public class Work01 {
    public static void main(String[] args) {
        Num num = new Num(1);
        Thread t = new Base(num);
        Thread t1 = new Oven(num);
        t.setName("t");
        t1.setName("t1");
        t.start();
        t1.start();
    }
}

/**
 * 共享数字对象
 */
class Num{
    int number=0;

    public Num(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
/**
 * 输出基数类线程
 */
class Base extends Thread{
    Num num;
    public Base(Num num){
        this.num = num;
    }
    @Override
    public void run() {
        while (num.getNumber()<=50) {
            //锁住共享的num对象，这个参数只能传对象
            synchronized (num) {
                //如果这个对象的数字等于基数的话，那么我们就输出，然后进入等待，释放当前的锁
                if (num.getNumber() % 2 ==1) {
                    System.out.println(Thread.currentThread().getName() + "输出了基数-->" + num.getNumber());
                    num.setNumber(num.getNumber() + 1);
                    try {
                        //进入等待，并且释放当前的锁，让其他线程能够使用
                        this.num.wait();
                    } catch (
                            InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //如果条件不成立的话那么久唤醒正在等待的锁
                this.num.notifyAll();
            }

        }
    }
}


/**
 * 输出偶数类线程
 */
class Oven extends Thread{
    Num num;
    public Oven(Num num){
        this.num = num;
    }
    @Override
    public void run() {
        while (num.getNumber()<50) {
            //锁住共享的对象
            synchronized (num) {
                //如果条件成立的话那么就输出，输出后加1，并且唤醒正在等待的锁
                if (num.getNumber() % 2 ==0) {
                    System.out.println(Thread.currentThread().getName() + "输出了偶数-->" + num.getNumber());
                    num.setNumber(num.getNumber() + 1);
                    this.num.notifyAll();
                }
               /* try {
                    this.num.wait();
                    } catch (
                    InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        }
    }
}
