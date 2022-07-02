package work.demo.day30.work1;

import java.util.*;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/29 002910:53
 * 产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class Work01 {
	public static void main ( String[] args ) {
		Random random = new Random();
		int[] sum = new int[10];
		//产生10个随机数,并放到数组中
		for ( int i = 0; i < sum.length; i++ ) {
			sum[i] = random.nextInt(100);
		}
		//创建集合
		List<Integer> list = new ArrayList<>();
		//遍历数组，取出大于10的数字
		for ( int i = 0; i < sum.length; i++ ) {
			if ( sum[i]>10 ){
				list.add( sum[i] );
			}
			System.out.println(sum[i]);
		}
		System.out.println("=================");
		//排序集合
		Collections.sort( list );
		//遍历集合
		for ( Integer i:list ){
			System.out.println(i);
		}
	}
}
