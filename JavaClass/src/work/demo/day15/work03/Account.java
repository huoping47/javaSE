package work.demo.day15.work03;

public class Account {
    private int id =1000;
    private double money = 2000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    Customer customer;
}
