package work.demo.day33;

/**
 * @author 霍平
 * @date 2022/6/4 16:15
 * @mouse 六月
 */

public class TicketThread extends Thread{
    private Ticket t;
    public TicketThread(Ticket t){
        this.t = t;
    }
    @Override
    public void run() {
        while (t.getKet() !=1) {
//            System.out.println(Thread.currentThread().getName());
            try {
                t.checkIn();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
