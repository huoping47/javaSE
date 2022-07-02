package work.demo.day33;

/**
 * @author 霍平
 * @date 2022/6/4 16:06
 * @mouse 六月
 */

public class Work02 {
    public static void main(String[] args) {
    //模拟售票场景
        Ticket ticket = new Ticket();
        Thread t = new TicketThread(ticket);
        t.setName("t");
        t.start();
        Thread t1 = new TicketThread(ticket);
        t1.setName("t1");
        t1.setPriority(8);
        t1.start();
        Thread t2 = new TicketThread(ticket);
        t2.setName("t2");
        t2.setPriority(10);
        t2.start();
    }
}
