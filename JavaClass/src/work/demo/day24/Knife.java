package work.demo.day24;
/*
刀类
 */
public class Knife extends Weapon{
    public void Sticks(){
        System.out.println("刀也可以移动？");
    }

    @Override
    public void attack() {
        System.out.println("刀还可以攻击？？");
    }
}
