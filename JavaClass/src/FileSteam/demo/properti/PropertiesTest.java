package FileSteam.demo.properti;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author 霍平  2022/6/1 0001
 * @email huoping_47@126.com
 * @title   IO和Properties的联合使用
 */
public class PropertiesTest {
	public static void main ( String[] args ) throws Exception{
		FileInputStream fis = new FileInputStream( "JavaClass/src/FileSteam/demo/properti/Properti.txt" );
		Properties pro = new Properties();
		pro.load( fis );
		System.out.println(pro.getProperty( "name" ));
		System.out.println(pro.getProperty( "age" ));
	}
}
