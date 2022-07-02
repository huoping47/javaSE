package thread.demo;

/**
 * @author 霍平  2022/6/2 0002
 * @email huoping_47@126.com
 * @title   第一种方式，使用run方法执行多线程
 */
public class ThreadTest01 {
	public static void main ( String[] args ) {
		Students stu = new Students();
		//开辟一个分支线程，开辟出来就执行结束
		stu.start();
		for ( int i = 0; i < 100; i++ ) {
			System.out.println("主线程--->"+i);
		}
	}
}

class Students extends Thread{
	@Override
	//重写Thread里面的run方法，这就是第一个分支线程，方法体是分支线程需要执行的代码
	public void run () {
		for ( int i = 0; i < 100; i++ ) {
			System.out.println("分支线程--->"+i);
		}
	}
}
