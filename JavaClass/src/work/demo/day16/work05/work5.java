package work.demo.day16.work05;
/*
编写Java程序用于显示人的姓名和年龄。
定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。
在main方法中创建人类的实例然后将信息显示
 */
public class work5 {
    public static void main(String[] args) {
        Person p = new Person("张三",41);
        p.dispaly();
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void dispaly(){
        System.out.println("他叫"+this.name+"今年"+this.age+"岁");
    }
}