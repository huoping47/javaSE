package work.demo.day16.work01;
/*
1、猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
	如果大了则提示大了
	小了则提示小了
	等于则提示猜测成功
 */
public class Work1 {
    public static void main(String[] args) {
        B b = new B();
        b.guess();
    }
}
