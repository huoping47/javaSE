package work.demo.day18;
//Employee：这是所有员工总的父类，
//		属性：
//			员工的姓名,员工的生日月份。
//		方法：getSalary(int month)
//			根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
public class Employee {
    private String name;
    private int birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void getSalary(int month){

    }

}
