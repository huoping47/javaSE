package work.demo.day16.work04;
/*
编写Java程序模拟简单的计算器。
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
分别对两个成员变量执行加、减、乘、除的运算。

在main方法中创建Number类的对象调用各个方法并显示计算结果
 */
public class work4 {
    public static void main(String[] args) {
        Number nb = new Number(20,30);
        nb.addition();
        nb.subtration();
        nb.multiplication();
        nb.division();
    }
}
