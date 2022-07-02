package work.demo.day33;

/**
 * @author 霍平
 * @date 2022/6/4 16:08
 * @mouse 六月
 */

class Ticket {
    private int ket = 200;
    boolean start =true;
    public void checkIn() throws InterruptedException {
        synchronized (this) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            if (start) {
                if (this.getKet() == 0) {
                    this.start=false;
                    TicketExcption ticketExcption = new TicketExcption("票已经卖完了");
                    System.out.println(ticketExcption.getMessage());
                }
                System.out.println(Thread.currentThread().getName()+"取票"+this.getKet());
                this.setKet(this.getKet()-1) ;
            }else{
                return;
            }

        }
    }

    public Ticket() {
    }

    public Ticket(int ket) {
        this.ket = ket;
    }

    public int getKet() {
        return ket;
    }

    public void setKet(int ket) {
        this.ket = ket;
    }
}