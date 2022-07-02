package interface_class.demo;

public class InterfaceTest3 {
    public static void main(String[] args) {
        fly f = new Dog();//父类指向子类
        f.flys();
        Animal a = new Dog();//父类指向子类
        a.eat();
        fly f1 = new Cat();
        f1.flys();
        Animal a1 = new Cat();
        a1.eat();
    }
}
/*
动物父类
 */
class Animal{
    public void eat(){
    }
}
interface fly{
    void flys();
}
class Dog extends Animal implements fly{
    @Override//重写接口的抽象方法
    public void flys() {
        System.out.println("会飞的狗狗");
    }
    public void eat(){//重写Animal父类的方法
        System.out.println("狗狗再吃饭呢");
    }
}
class Cat extends Animal implements fly{
    @Override//重写Animal父类的方法
    public void eat() {
        System.out.println("猫猫在吃饭饭");
    }

    @Override//重写接口的抽象方法
    public void flys() {
        System.out.println("会飞的猫猫");
    }
}





