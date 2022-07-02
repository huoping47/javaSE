package work.demo.day17.work01;
/*
1.编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
可以弹奏的乐器包括二胡、钢琴和琵琶。
	实现思路及关键代码：
		1)定义乐器类Instrument，包括方法makeSound()
		2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
		3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
		4)定义测试类，给乐手不同的乐器让他弹奏
 */
public class Work1 {
    public static void main(String[] args) {
        Musician m = new Musician();
        Instrument i = new ErHu();
        Instrument i1 = new Violin();
        Instrument i2 = new Piano();
        m.play(i2);
    }
}
