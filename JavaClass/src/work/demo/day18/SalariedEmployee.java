package work.demo.day18;
//SalariedEmployee：
//		Employee 的子类，拿固定工资的员工。
//		属性：月薪
public class SalariedEmployee extends Employee{
    private int salary = 3000;

    @Override
    public void getSalary(int month) {
        if (month ==this.getBirthday()){
            this.salary+=100;
        }
        System.out.println(this.getName()+"这个月工资"+this.salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
