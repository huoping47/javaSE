package work.demo.Test;

import java.util.Random;

/**
 * @author 霍平  2022/5/29 0029
 * @email huoping_47@126.com
 * @title
 */
public class MathTest {
	public static void main ( String[] args ) {
//		static int max​(int a, int b) 返回两个 int值中较大的 int 。
		System.out.println(Math.max( 10,20 ));
		System.out.println(Math.min( 10,20 ));//最小值
		
		System.out.println(Math.random());
		//生成随机数
		Random random = new Random();
		System.out.println(random.nextInt(20));//20以内的随机数
		
	}
}
