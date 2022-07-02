package FileSteam.demo.objOut;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 霍平  2022/6/1 0001
 * @email huoping_47@126.com
 * @title
 */
public class Input {
	public static void main ( String[] args ) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("JavaClass\\src\\FileSteam\\demo\\objOut\\write.txt") );
		Object o = in.readObject();
		System.out.println(o);
		
		in.close();
	}
}
