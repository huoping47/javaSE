package gather.demo.map;

import java.util.*;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002814:20
 * Map集合
 *      Map和Collection没有任何继承关系
 *      Map是以key和value的方式存储数据
 *          key和value都是引用数据类型
 *          key和value都是存储的对象内存地址
 *          key起到主导地位，value是key的一个附属品
 */
public class MapTest01 {
	public static void main ( String[] args ) {
		//Map中常用的几种方法
		//创建一个Map集合，以键值对的方式，泛型指定存储数据内存
		Map<Integer,String> map = new HashMap<>();
		//调用put方法存储元素进去，Collection是调用add的方法
		map.put( 1,"张三" );
		map.put( 2,"李四" );
		map.put( 3,"王五" );
		map.put( 4,"老六" );
		map.put( 5,"刘七" );
		System.out.println(map.get( 4 ));//通过键来获取值，key获取value，返回一个字符串，因为上面的value是定义的字符串
		System.out.println(map.size());//获取当前集合中的个数
		System.out.println(map.isEmpty());//判断当前的集合是否为空
//		Set< Integer > set = map.keySet();//得到集合中所有的key
//		for ( Integer i : set ){
//			System.out.println(i);
//		}
		System.out.println(map.remove( 5 ));
		System.out.println(map.size());//获取当前集合中的个数
		
		Collection<String> collection = map.values(); //获取所有的值，返回一个Collection的类型
		for ( String s:collection ){
			System.out.println(s);
		}
		
		System.out.println(map.containsKey( 5 ));//判断这个集合中是否包含这个key
		System.out.println(map.containsValue( "王五" ));//判断这个集合中是否包含这个value
		
		//foreach遍历Map集合
		for ( Integer integer: map.keySet() ){//调用ketSet方法获取所有的key，然后获取到key之后可以获取到key对应的值
			System.out.println(map.get( integer ));
		}
		
		
		Set<Integer> integer = map.keySet();//通过map集合获取所有的key，所得key是一个set集合
		Iterator<Integer> iterator = integer.iterator();
		//while遍历Map集合,需要迭代器才能使用while循环
		while(iterator.hasNext()){
			Integer integer1 = iterator.next();
			String s = map.get( integer1 );
			System.out.println(integer1 +"="+s);
		}
		
		System.out.println("========================");
		//通过这种方式遍历集合
		Set< Map.Entry< Integer, String > > set = map.entrySet();
		
		//使用迭代器取出集合中的元素
		Iterator<Map.Entry<Integer,String>> iterator1= set.iterator();
		while ( iterator1.hasNext() ){
			Map.Entry<Integer,String> m = iterator1.next();
			Integer integer1 = m.getKey();
			String s = m.getValue();
			System.out.println(integer1+"=="+s);
		}
		
		
		
		//foreach循环取出集合中的元素
		for ( Map.Entry<Integer,String> maps : set){
			Integer integer1 = maps.getKey();
			String value = maps.getValue();
			System.out.println(integer1+"="+value);
		}
	}
}
