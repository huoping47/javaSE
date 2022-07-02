package work.demo.day32;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 霍平  2022/6/2 0002
 * @email huoping_47@126.com
 * @title
 */
public class Test {
	public static void main ( String[] args ) throws Exception {
		ObjectInputStream obj = new ObjectInputStream( new FileInputStream( "src/work/demo/day32/Studes.txt" ) );
		Object o = obj.readObject();
		Object os = obj.readObject();
		Object o1 = obj.readObject();
		Object o1s = obj.readObject();
		Object o2 = obj.readObject();
		Object o2s = obj.readObject();
//		Map<Integer,String> map = (Map)o;
		System.out.println(os);
		System.out.println(o1s);
		System.out.println(o2s);
//		List<Object> list = ( List<Object> ) o;
//		for ( Object os:list ){
//			System.out.println(( os ));
//		}
		obj.close();
		
	}
}
