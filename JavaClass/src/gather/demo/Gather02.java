package gather.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 霍平
 */
public class Gather02 {
    public static void main(String[] args) {
        /*
        关于Collection中的iterator的遍历和迭代
         */
//        Collection collection = new ArrayList();
        Collection collection = new HashSet();
        collection.add("abc");
        collection.add("Def");
        collection.add(123);
        collection.add(new Object());
        boolean b = collection.contains("Def");//判断一个元素中是否包含这个内容，contains已经重写了equals方法
        System.out.println(b);
        //生成并获取到迭代器
        Iterator it = collection.iterator();
        /*
        迭代器中的三个方法
        boolean hasNext() 如果迭代具有更多元素，则返回 true 。
        E next() 返回迭代中的下一个元素。
        default void remove() 从底层集合中移除此迭代器返回的最后一个元素（可选操作）。
         */
        /*boolean b = it.hasNext();//判断该数组中时候有元素，有就返回true，反之false
        if (b) {
            Object o = it.next();//取出下一个元素中的值
            Object o1 = it.next();
            Object o2 = it.next();
            Object o3 = it.next();
            System.out.println(o);
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o3);
        }*/

        //循环遍历取出元素
        while(it.hasNext()) {
            Object object = it.next();
            System.out.println(object);
        }




    }
}
