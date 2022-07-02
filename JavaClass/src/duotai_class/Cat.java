package duotai_class;

public class Cat  extends  Animal{
    @Override
    //重写父类继承过来的方法
    public void move() {
        System.out.println("猫在伸懒腰");
    }
    //不是从父类继承过来的方法，这是cat子类特有的行为
    public void CatMove(){
        System.out.println("猫在抓老鼠");
    }
}
