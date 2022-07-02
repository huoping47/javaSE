package gather.demo.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002813:22
 * foreach循环
 * 	语法格式：
 * 		for（元素类型 变量名：数组/集合）{
 *
 * 		}
 * 	foreach有一个缺点，就是没有下标
 */
public class ForTest01 {
	public static void main ( String[] args ) {
		int[] ints = new int[]{1,5,3,6,8,2,74,2,};
		//使用foreach循环遍历数组
		for ( int a: ints ) {//a里面就是数组中的每个元素
//			System.out.println(a);
		}
		
		List<String> list = new ArrayList<>();
		list.add( "你" );
		list.add( "在" );
		list.add( "干" );
		list.add( "嘛" );
//		使用迭代器遍历集合
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Object o = iterator.next();
			System.out.println(o);
		}
		
//		使用for循环迭代集合中的元素  只针对有下标的集合
		for ( int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get( i ));
		}
		
//		使用增强版foreach循环迭代集合中的元素
		for ( String s : list ){
			System.out.println(s);
		}
	}
}
