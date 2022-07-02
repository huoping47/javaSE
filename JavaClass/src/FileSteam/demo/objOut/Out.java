package FileSteam.demo.objOut;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author 霍平  2022/6/1 0001
 * @email huoping_47@126.com
 * @title
 */
public class Out {
	public static void main ( String[] args ) throws Exception{
		Students students = new Students(15,"张三");
		//序列化
		
		ObjectOutputStream obj = new ObjectOutputStream( new FileOutputStream("JavaClass\\src\\FileSteam\\demo\\objOut\\write.txt") );
		obj.writeObject( students );
		obj.flush();
		obj.close();
	}
}
