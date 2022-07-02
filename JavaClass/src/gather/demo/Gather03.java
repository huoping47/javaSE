package gather.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * @author 霍平
 */
public class Gather03 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        /*Animal animal = new Animal("张三");
        collection.add(animal);
        Animal animal1 = new Animal("张三");
        boolean b = collection.contains(animal1);
        System.out.println(b);//输出false，因为我们的Animal方法中没有重写equlas方法，所以比较的是内存地址
        System.out.println(b);//输出true，因为我们的Animal方法中重写了equlas方法，所以比较的是内容*/


        /*String s = new String("abc");
        collection.add(s);
        String s1 = new String("abc");
        collection.remove(s1);//remove底层也会调用equals方法，如果两个对象的内容一样，他会把两个对象一起删除
        System.out.println(collection.size());//输出  0*/

        String s = new String("abc");
        collection.add(s);
        String s1 = new String("abcc");
        collection.add(s1);
        collection.add(123);
        Object[] objects = collection.toArray();//把集合转换成数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
//        collection.remove(s1);
        System.out.println(collection.size());//输出  1
    }
}
class Animal{
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

}