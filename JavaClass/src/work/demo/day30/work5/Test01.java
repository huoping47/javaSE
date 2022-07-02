package work.demo.day30.work5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title
 *
5.有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
如{黑龙江省=哈尔滨, 浙江省=杭州, …}
 */
public class Test01 {
	public static void main ( String[] args ) {
		String[] strings = new String[]{"黑龙江省","浙江省","江西省","广东省","福建省"};
		String[] strings1 = new String[]{"哈尔滨","杭州","南昌","广州","福州"};
		Map<String,String> map = new HashMap<>();
		for ( int i = 0; i < strings.length; i++ ) {
			map.put( strings[i],strings1[i] );
		}
		Set<String> set = map.keySet();
		for ( String s:set){
			System.out.println(s+"==="+map.get( s ));
		}
	}
}
