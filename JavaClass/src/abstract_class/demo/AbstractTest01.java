package abstract_class.demo;

public class AbstractTest01 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();
//        Dog d =(Dog) a;//强制类型转换
//        d.move1();
        Animal a1 = new Cat();
        a1.move();
    }
}
/*
动物类，抽象类
 */
abstract class Animal{
    public abstract void move();
}

class Dog extends Animal{
    @Override
    /*
（一个非抽象的类继承抽象类，必须抽象类中的抽象方法给实现了，重写了）
（一个抽象的类继承抽象类，抽象类中的抽象方法可以不需要实现，重写）
     */
    public void move() {
        System.out.println("狗狗在啃骨头");
    }
    /*public void move1(){
        System.out.println("maomao在啃骨头");
    }*/
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("我是猫，我在睡觉");
    }
}