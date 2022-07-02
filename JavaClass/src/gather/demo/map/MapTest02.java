package gather.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002815:38
 */
public class MapTest02 {
	public static void main ( String[] args ) {
		Map<Integer,String> map = new HashMap<>();
		map.put( 1,"张三" );
		map.put( 3,"李四" );
		map.put( 5,"王五" );
		map.put( 7,"老六" );
		map.put( 9,"许七" );
//		System.out.println(map.get( 7 ));
		Set<Integer> set = map.keySet();
		for ( Integer integer: set ){
			System.out.println(map.get( integer ));
		}
		System.out.println("==============");
		
		//此遍历集合的效率较高，一般是在大数据的时候使用
		Set<Map.Entry<Integer,String>> set1 = map.entrySet();
		for ( Map.Entry<Integer,String> m : set1 ){
			Integer integer = m.getKey();
			String string = m.getValue();
			System.out.println(integer+"=="+string);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
