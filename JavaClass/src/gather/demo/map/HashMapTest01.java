package gather.demo.map;

import java.util.*;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002813:49
 * HashMap集合：
 *      底层是一个哈希表/散列表的数据结构
 *      哈希列表是怎么样数据结构呢？
 *          哈希表是一个数组和单项链表的结合体
 *          数组：在查询方面效率很高，随机增删方面效率很低
 *          单向链表：在查询方面效率低，但是随机增删方面效率很高
 *          哈希表将两种数组结构联合起来，充分发挥他们各自的优点
 *
 *          HashMap集合的key部分特点：
 *              无序，不可重复
 *              为什么无序？因为不一定挂到哪个单向链表上
 *              不可重复是调用Equals方法来保证HashMao集合的key不可重复，如果key重复了，value会覆盖
 *              放在HashMap集合key部分的元素其实就是方法Hashset中了，所以HashSet集合中的元素也需要重写HashCode
 *              和equals方法
 *
 */
public class HashMapTest01 {
	public static void main ( String[] args ) {
		Map<Integer,String> map = new HashMap<>();
		map.put( 1,"张三" );
		map.put( 3,"李四" );//无序，不可重复
		map.put( 3,"李四" );
		map.put( 2,"张三" );
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		for ( Map.Entry<Integer,String> map1:set ){
			System.out.println(map1.getKey()+"=="+map1.getValue());
		}
		
//		放在HashMap集合key部分的，以及放在HashSet集合的元素，需要同时重写HashCode和equals方法
		Set<Student> map1 = new HashSet<>();
		Student student = new Student( "张三" );
		Student student1 = new Student( "张三" );
		Student student2 = new Student( "李四" );//如果equals为true，那么这两个的哈希值一定是一样的
		map1.add( student );
		map1.add( student1 );
		map1.add( student2 );
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(map1.size());
		System.out.println(student.equals( student1 ));
		
		
		
		System.out.println("============");
		
		
		//Map中，如果key一样，那么value就会覆盖，key只能值存储对象的内存地址
		Map<Integer,String> map2 = new HashMap<>();
		map2.put( 1,"张三" );
		map2.put( 1,"李四" );
		Set<Map.Entry<Integer,String>> set1 = map2.entrySet();
		for ( Map.Entry<Integer,String>m:set1 ){
			System.out.println(m.getKey()+"=="+m.getValue());
		}
		
		Set<String > set2 = new HashSet<>();
		set2.add( "你好" );
		set2.add( "你好" );
		for ( String s:set2 ){
			System.out.println(s);
		}
		System.out.println(set2.size());
	}
}
