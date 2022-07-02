package work.demo.day20.work01;
/*
第一题：
（1）定义一个抽象类Weapon,该抽象类有两个抽象方法attack()，move()
这两个方法分别表示武器的攻击方式和移动方式。

（2）定义3个类：Tank,Flighter,WarShip都继承自Weapon,
分别用不同的方式实现Weapon类中的抽象方法。

编写测试程序main方法，创建多个不同武器的实例。并分别调用attack()和move()方法。
能用多态尽量使用多态
 */
public class Work01 {
    public static void main(String[] args) {
        Weapon w = new WarShip();
        w.attack();
        w.move();
        Weapon w1 = new Filghter();
        w1.move();
        w1.attack();
        Weapon w2 = new Tank();
        w2.attack();
        w2.move();
    }
}
