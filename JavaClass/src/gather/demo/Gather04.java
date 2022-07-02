package gather.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 霍平
 * @Email huoping_47@126.com
 * @date 2022/5/27 0027 19:10
 * 集合中的删除和迭代器的删除区别
 */
public class Gather04 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("abc");
        collection.add("def");
        collection.add(123);
        collection.add(3.141592654);
        Iterator iterator = collection.iterator();
//        collection.remove("abc");//集合的删除方法java.util.ConcurrentModificationException;如果在集合中删除了元素，表示
// 这个集合的结构发生了改变，就会报错，集合中的元素删除了之后，迭代器一定要重新获取/迭代，因为迭代器已经存储了
// 所添加的元素的个数，所以少一个就会报错，因此需要重新迭代，但如果是在创建迭代器之前删除的，那么就没关系
        while (iterator.hasNext()){
            Object o = iterator.next();
//            iterator.remove();这个是迭代器的一个删除方法，用迭代器的删除方法不会提前改变集合中的结构
            System.out.println(o);
        }
        System.out.println(collection.size());
    }
}
