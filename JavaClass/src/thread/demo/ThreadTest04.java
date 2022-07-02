package thread.demo;

/**
 * @author 霍平  2022/6/3 0003
 * @email huoping_47@126.com
 * @title   获取线程的名字
 */
public class ThreadTest04 {
	public static void main ( String[] args ) {
		User u = new User();
		u.setName( "u1" );
		u.start();
		User u2 = new User();
		u2.setName( "u2" );
		u2.start();
	}
}
class User extends Thread {
	@Override
	public void run () {
		for ( int i = 0; i < 10; i++ ) {
			try {
				Thread.sleep( 1000*2 );
			} catch ( InterruptedException e ) {
				e.printStackTrace();
			}
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+"分支线程->"+i);
		}
	}
}