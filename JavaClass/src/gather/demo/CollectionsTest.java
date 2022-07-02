package gather.demo;

import java.util.*;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002821:27
 * java.util.collection是一个接口
 * java.util.collections是一个工具类
 */
public class CollectionsTest {
	public static void main ( String[] args ) {
		List<wugui2> list = new ArrayList<>();
		list.add( new wugui2( 15 ) );
		list.add( new wugui2( 180 ) );
		list.add( new wugui2( 197 ) );
		list.add( new wugui2( 135 ) );
		Collections.sort( list );//Collections里面的sort排序，自定义的元素需要实现Comparable
		for ( wugui2 w:list ){
			System.out.println(w);
		}
		System.out.println("=========");
		Set<wugui2> set = new HashSet<>();
		set.add( new wugui2( 51 ) );
		set.add( new wugui2( 817 ) );
		set.add( new wugui2( 471 ) );
		set.add( new wugui2( 451 ) );
		set.add( new wugui2( 477 ) );
		
		//将set集合转换成List集合
		List<wugui2> list1 = new ArrayList<>(set);
//		Collections.sort( list1 );
//		for ( wugui2 w2:list1 ){
//			System.out.println(w2);
//		}
		System.out.println("===========");
		//这种方式也是可以排序的
		Collections.sort( list1,wugui2::compareTo);
		for ( wugui2 w2:list1 ){
			System.out.println(w2);
		}
	}
}
class wugui2 implements Comparable<wugui2>{
	int age;
	
	public wugui2 ( int age ) {
		this.age = age;
	}
	
	@Override
	public String toString () {
		return "wugui2{" +
				"age=" + age +
				'}';
	}
	
	@Override
	public int compareTo ( wugui2 o ) {
		return this.age-o.age;
	}
}