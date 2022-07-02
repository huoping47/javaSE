package gather.demo;

import java.util.ArrayList;
import java.util.Collection;

/*
集合关于java中Collection接口中常用的方法
    1、collection中能存放什么元素？
        没有使用“泛型”之前，Collection中存储Object的所有子类型
        使用了“泛型”之后，Collection中只能存储某个具体的类型，
        Collection中什么都能存，只要是Object的子类型就行，（集合
        中不能直接存储基本数据类型，也不能存java对象，只是存储java对象的内存地址）
 */
public class Gather01 {
    public static void main(String[] args) {
        /*
        常用类型
         */
        Collection collection = new ArrayList();
        collection.add("ABC");//保存的是ABC的内存地址
        collection.add(1);  //自动装箱
        collection.add(1.34);
//        System.out.println(collection.size());
//        collection.clear();
        collection.remove(1);
        boolean b = collection.contains("abc");
//        System.out.println(b);
//        System.out.println(collection.size());
        Object[] o = collection.toArray();//把集合中的元素转换成数组
        for (int i = 0; i < o.length ;i++) {
            System.out.println(o[i]);
        }
    }
}
