package FileSteam.demo.file;

import java.io.File;
import java.io.IOException;

/**
 * @author 霍平  2022/5/31 0031
 * @email huoping_47@126.com
 * @title
 */
public class FileTest01 {
	public static void main ( String[] args ) throws IOException {
		File file = new File( "D:\\java\\关于内存管理.txt" );
		File file1 = new File( "D:\\java\\D\\C\\F\\E" );
		System.out.println(file.exists());//获取文件是否存在
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.getParent());
//		if ( !file.exists()) {
//			file.createNewFile();//创建一个新文件
//		}
//		if ( !file1.exists() ) {
//			file1.mkdirs();//创建多个目录
//		}
		System.out.println(file.getAbsoluteFile());
	}
}
