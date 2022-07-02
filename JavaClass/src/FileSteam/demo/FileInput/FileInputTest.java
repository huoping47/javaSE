package FileSteam.demo.FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title   文件字节输入流，万能的，任何类型的文件都可以读取
 *      这种读取方式的缺点是读取数据太频繁，硬盘和内存之间交互太频繁了
 */
public class FileInputTest {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "D:\\java\\新建文本文档.txt" );
//			while ( true ){
//				int fiss = fis.read();
//				if ( fiss == -1 ) {
//					break;
//				}
//				System.out.println(fiss);
//			}
			//改造while循环
			int fiss = 0;
			while((fiss = fis.read()) !=-1){
				System.out.println(fiss);
			}
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			if ( fis != null ) {
				try {
					fis.close();
				} catch ( IOException e ) {
					e.printStackTrace();
				}
			}
		}
	}
}
