package work.demo.day20.work01;

public class WarShip extends Weapon{
    @Override
    public void attack() {
        System.out.println("防御塔正在攻击你");
    }

    @Override
    public void move() {
        System.out.println("英雄正在攻击你");
    }
}
