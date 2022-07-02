package work.demo.day16.work03;
/*
在程序中经常要对时间进行操作但是并没有时间类型的数据。
那么我们可以自己实现一个时间类来满足程序中的需要。
定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
为了保证数据的安全性这三个成员变量应声明为私有。
为MyTime类定义构造方法以方便创建对象时初始化成员变量。
再定义diaplay方法用于将时间信息打印出来。
为MyTime类添加以下方法
	addSecond(int sec)
	addMinute(int min)
	addHour(int hou)
	subSecond(int sec)
	subMinute(int min)
	subHour(int hou)
分别对时、分、秒进行加减运算。
 */
public class Work3 {
    public static void main(String[] args) {
        MyTime mt = new MyTime(15,40,30);
//        mt.addSecond(11);
//        mt.addMinute(30);
//        mt.addHour(11);
//        mt.subSecond(20);
//        mt.subMinute(50);
        mt.subHour(10);
        mt.diaplay();

    }
}
