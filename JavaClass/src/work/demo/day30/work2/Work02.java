package work.demo.day30.work2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title   已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
 * 将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class Work02 {
	public static void main ( String[] args ) {
		String[] strings = {"13579","246810","147963","963741","13579","246810","159753"};
		LinkedList< String > list = new LinkedList<>( ) ;
		//使用for循环添加数据
		for ( int i = 0; i < strings.length; i++ ) {
			list.add( strings[i] );
		}
		//利用set集合删除重复的元素
		Set<String> set = new HashSet<>(list);
		LinkedList<String> strings1 = new LinkedList<>(set);
		//使用foreach循环遍历集合
		for ( String s1:strings1 ){
			System.out.println(s1);
		}
		System.out.println("============");
		Iterator<String>iterator = strings1.iterator();
		while ( iterator.hasNext() ){
			Object o = iterator.next();
			System.out.println(o);
		}
	}
}
