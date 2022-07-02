package work.demo.day18;
//SalesEmployee：
//		Employee 的子类，销售人员，工资由月销售额和提成率决定。
//		属性：月销售额、提成率
public class SalesEmployee extends Employee{
    protected int money = 60000;
    protected double ssion = 0.15;
    private int sum;

    @Override
    public void getSalary(int month) {
        if (this.getBirthday() == month){
            this.sum +=100;
        }
        System.out.println(this.getName()+"你这个月工资"+this.money*this.ssion);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getSsion() {
        return ssion;
    }

    public void setSsion(double ssion) {
        this.ssion = ssion;
    }
}
