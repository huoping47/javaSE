package work.demo.day32;

import java.io.IOException;

/**
 * @author 霍平  2022/6/2 0002
 * @email huoping_47@126.com
 * @title
 */
public class Work01 {
	public static void main ( String[] args ) {
		try {
			Students  stu= new Students();
		} catch ( IOException e ) {
			e.printStackTrace();
		} catch ( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
	}
}
