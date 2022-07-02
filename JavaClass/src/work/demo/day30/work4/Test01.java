package work.demo.day30.work4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title
 * 4. 现在有一个map集合如下：
 * Map<Integer,String> map = new HashMap<Integer, String>();
 * map.put(1, "张三丰");
 * map.put(2, "周芷若");
 * map.put(3, "汪峰");
 * map.put(4, "灭绝师太");
 * 要求：
 * 	1.遍历集合，并将序号与对应人名打印。
 * 	2.向该map集合中插入一个编码为5姓名为郭靖的信息
 * 	3.移除该map中的编号为1的信息
 * 	4.将map集合中编号为2的姓名信息修改为"周林"
 */
public class Test01 {
	public static void main ( String[] args ) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "张三丰");
		hashMap.put(2, "周芷若");
		hashMap.put(3, "汪峰");
		hashMap.put(4, "灭绝师太");
		
		//通过获取所有的键来获取值
//		Set<Integer> set = hashMap.keySet();
//		for ( Integer i: set ){
//			System.out.println(i+"=="+hashMap.get( i ));
//		}
	
		//这种方式获取value和key
		hashMap.put( 5,"郭靖" );
		hashMap.remove( 1 );
//		hashMap.remove( 3,"汪峰" );
		hashMap.replace( 3,"周林" );//将key为3的值替换为周林
		Set<Map.Entry<Integer,String>> set = hashMap.entrySet();
		for ( Map.Entry<Integer,String> m :set){
			System.out.println(m.getKey()+"=="+m.getValue());
		}
	}
}
