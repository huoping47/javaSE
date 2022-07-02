package work.demo.day30.work3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/29 0029
 * @title   分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
 * 如果成绩一样，
 * 那在成绩排序的基础上按照年龄由小到大排序。
 * 姓名（String）年龄（int）分数（float）
 * liusan			20				90.0F
 * lisi				22				90.0F
 * wangwu			20				99.0F
 * sunliu			22				100.0F
 * 编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
 * 在主函数中使用Comparable 与 Comparetor分别对ArrayList进行排序.
 */
public class Test01 {
	public static void main ( String[] args ) {
		Students students = new Students("zhangsan ",18,90.8);
		Students students1 = new Students("lisi ",24,68.8);
		Students students2 = new Students("wangwu ",21,78);
		Students students3 = new Students("laoliu ",19,68.8);
//		ArrayList<Students> arrayList = new ArrayList<>();
		ArrayList<Students> arrayList = new ArrayList<>();
		arrayList.add( students );
		arrayList.add( students1 );
		arrayList.add( students2 );
		arrayList.add( students3 );
		
		//使用Comparable进行排序
		Collections.sort( arrayList );
		
		for ( Students s:arrayList ){
			System.out.println(s);
		}
	}
}
