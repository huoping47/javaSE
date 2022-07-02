package gather.demo.map;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002821:02
 * 比较器
 * 放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
 *      第一种：放在集合中的元素实现java.lang.Compareble接口
 *      第二种：在构造TreeSet或者TreeMap集合的时候给他传一个比较器对象
 *      Compareble和Comparetor怎么选择？
 *          当比较规则不会发生改变时候，或者说当比较规则只有1个的时候，建议使用Comparable接口
 *          当比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口
 */
public class TreeSet03 {
	public static void main ( String[] args ) {
//		TreeSet<wugui> treeSet = new TreeSet<>(new wuguis());
		//匿名内部类的方式
		TreeSet<wugui> treeSet = new TreeSet<>( new Comparator< wugui >() {
			@Override
			public int compare ( wugui o1, wugui o2 ) {
				return o1.age-o2.age;
			}
			
		} ){};
		treeSet.add( new wugui( 250 ) );
		treeSet.add( new wugui( 300 ) );
		treeSet.add( new wugui( 180 ) );
		treeSet.add( new wugui( 150 ) );
		for ( wugui w:treeSet ){
			System.out.println(w);
		}
	}
}
class wugui{
	int age;
	
	public wugui ( int age ) {
		this.age = age;
	}
	
	@Override
	public String toString () {
		return "wugui{" +
				"age=" + age +
				'}';
	}
}
//比较器Comparator，比较自定义的类型
//class wuguis implements Comparator<wugui>{
//	@Override
//	public int compare ( wugui o1, wugui o2 ) {
//		return o1.age-o2.age;
//	}
//}
