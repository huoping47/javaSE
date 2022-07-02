package work.demo.day15.work04;
/*
三、(封装)已知一个类 Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编。
 */
public class Work4 {
    public static void main(String[] args) {
        Student stu = new Student("高岭小区","431000159");
        stu.getPostAddress();
    }
}
