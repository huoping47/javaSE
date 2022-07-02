package work.demo.day20.work01;

public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("大龙正在攻击你");

    }

    @Override
    public void move() {
        System.out.println("小龙正在移动");
    }
}
