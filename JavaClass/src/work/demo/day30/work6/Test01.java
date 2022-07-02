package work.demo.day30.work6;

import java.util.*;

/**
 * @author ???
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title
 *定义一个泛型为String类型的List集合，统计该集合中每个字符
 * （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
 * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Test01 {
	public static void main ( String[] args ) {
		List<String> list = new ArrayList<>();
		list.add( "aba" );
		list.add( "abc" );
		list.add( "ctf" );
		list.add( "pop" );//向list集合中存放数据
		Iterator it = list.iterator();
		//定义一个可变的值存放到v中
		HashMap<Character,Integer> map = new HashMap<>();//创建不可重复的map集合
		int c = 1;
		while(it.hasNext()){
			String s = it.next().toString();//把对象转换成字符串
			char[] chars = s.toCharArray();//把字符串在转换成char数组
			for ( int i = 0; i < chars.length; i++ ) {//遍历char数组
				//如果map里面的这个元素存在，那么就拿出存在的数据，加1
				if ( map.get( chars[i] ) !=null ) {
					Integer is = map.get( chars[i] );
					map.put( chars[i],is+1 );
				}else{
					map.put( chars[i],c );
				}
			}
		}
		Set<Map.Entry<Character,Integer>> set = map.entrySet();
		for ( Map.Entry<Character,Integer> s:set ){
			System.out.println(s.getKey()+"出现了"+s.getValue());
		}

	}
}
