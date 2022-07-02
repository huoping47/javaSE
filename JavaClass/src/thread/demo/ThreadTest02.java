package thread.demo;

/**
 * @author 霍平  2022/6/2 0002
 * @email huoping_47@126.com
 * @title   线程的第二种方法
 */
public class ThreadTest02 {
	public static void main ( String[] args ) {
		Thread t = new Thread(new Studen());
		t.start();
		for ( int i = 0; i < 500; i++ ) {
			System.out.println("主线程-->"+i);
		}
	}
}
class Studen implements Runnable{
	@Override
	public void run () {
		for ( int i = 0; i < 500; i++ ) {
			System.out.println("分支线程-->"+i);
		}
	}
}