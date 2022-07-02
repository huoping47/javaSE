package gather.demo;

import java.util.*;

/**
 * @author 霍平
 * @Email huoping_47@126.com
 * @date 2022/5/27 002719:24
 * List中的常用方法:
 *      void add​(int index, E element)，在列表指定位置插入元素，第一个参数是下标，方法使用不多，效率太低
 *      E get​(int index)   //获取某个下标的值
 *      int indexOf​(Object o)
 *      int lastIndexOf​(Object o)
 *
 */
public class GatherList01 {
    public static void main(String[] args) {
//        List list = new LinkedList();
//        ArrayList list = new ArrayList();
        List list = new ArrayList();
//        List list = new Vector();
        //添加元素，默认都是从集合的末尾添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(0,"e");//给个下标插入某一个元素
//        System.out.println(list.get(0));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
//            System.out.println(o);//输出e,a,b,c,d
        }
        //通过for循环获取集合中的值，使用到List中特有的方法get
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        //ArrayList中的构造方法
        Collection list1 = new HashSet();
        list1.add("adada");
        list1.add("adadaf");
        list1.add("adadaw");
        list1.add("adadas");
        //把HastSet的集合的元素转换成ArrayList集合
        List list2 = new ArrayList(list1);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        List list3 = new ArrayList();
        Collections.synchronizedList(list3);//这样就是把非线程安全的转换成了线程安全的
        list3.add("abc");
        list3.add("abccc");
        list3.add("abcc");




    }
}
