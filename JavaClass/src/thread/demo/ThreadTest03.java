package thread.demo;

import java.util.Scanner;

/**
 * @author 霍平  2022/6/2 0002
 * @email huoping_47@126.com
 * @title   匿名类部类的写法
 */
public class ThreadTest03 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner( System.in );
		Thread t = new Thread(new Runnable(){
			@Override
			public void run () {
				for ( int i = 0; i < 1000; i++ ) {
//					if ( i%9 == 0 ) {
//						System.out.println("请输入信息");
//						String str = sc.next();
//						System.out.println(str+"阻塞状态");
//					}
					System.out.println("分支进程-->"+i);
				}
				
			}
		});
		t.start();
		for ( int i = 0; i < 1000; i++ ) {
			System.out.println("主进程-->"+i);
		}
	}
}
