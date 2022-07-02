package work.demo.day19.work02;
/*
2、定义一个学生类
属性包括：学生编号、学生姓名、学生年龄
属性私有化，对外提供公开的set和get方法
提供无参构造和有参数构造方法
提供一个display()方法，通过该方法打印学生信息。
编写测试程序创建对象，调用display()方法。
 */
public class Work2 {
    public static void main(String[] args) {
        Students stu = new Students(123456,"张三",21);
        stu.display();
    }
}
