package work.demo.day18;
//BasePlusSalesEmployee：
//		SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
//		属性：底薪。
public class BasePlusSalesEmployee extends SalariedEmployee{
    private int salary = 3000;

    @Override
    public void getSalary(int month) {
        SalesEmployee sa = new SalesEmployee();
        if (this.getBirthday() == month){
            this.salary +=100;
        }

        System.out.println(this.getName()+"你这个月工资"+((sa.ssion*sa.money)+this.salary));
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
