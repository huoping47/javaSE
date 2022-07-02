package gather.demo.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 霍平
 * @Email huoping_47@126.com
 * @date 2022/5/27 002721:35
 * 泛型
 */
public class Generics01 {
    public static void main(String[] args) {
        //使用泛型,List<Animal>，指定这个集合中只能存储Animal的类型数据
        List<Animal> list = new ArrayList<Animal>();

//        list.add("adsad");//报错，只允许存储Animal的类型数据，因为使用了泛型

        Cat cat = new Cat();
        Brid bird = new Brid();
        list.add(cat);
        list.add(bird);

//        Iterator iterator = list.iterator();//创建迭代器

        Iterator<Animal> iterator = list.iterator();//创建泛型迭代器

        while (iterator.hasNext()){

//            Object obj = iterator.next();//迭代器不使用泛型的话返回的类型只能是Object对象
//            Animal animal = (Animal)obj;//所以此处需要强制类型转换
//            animal.move();

            Animal animal = iterator.next();//使用泛型迭代器之后，返回值的类型就是Animal对象了，不需要强制类型转换
            animal.move();
            if (animal instanceof Brid) {//调用子类特有的方法也还是需要向下转型
                Brid brid = (Brid)animal;
                brid.eat();
            }
        }
    }
}
class Animal{
    void move(){
        System.out.println("动物在移动");
    }
}
class Brid extends Animal{
    @Override
    void move() {
        System.out.println("鸟儿在飞翔");
    }
    void eat(){
        System.out.println("鸟儿再吃虫");
    }
}
class Cat extends Animal{
    @Override
    void move() {
        System.out.println("猫在抓老鼠");
    }
}
