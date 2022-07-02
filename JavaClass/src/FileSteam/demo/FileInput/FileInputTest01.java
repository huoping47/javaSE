package FileSteam.demo.FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 *  read​(byte[] b)
 *  一次读取一个b.length的字节长度，往byte数组当中读取
 *  Idea的起始路劲是Project文件开始找
 *  我的是从src下面开始找
 */
public class FileInputTest01 {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "新建文本文档.txt" );//相对路径
			fis = new FileInputStream( "src/FileSteam/demo/FileInput/新建文本文档.txt" );//相对路径
			byte[] bytes = new byte[4];
			int a = fis.read(bytes);
			System.out.println(new String(bytes,0,a));
			System.out.println(a);//返回4，返回的是读取到的数量，不是字节本身
			a = fis.read(bytes);
			System.out.println(new String(bytes,0,a));
			System.out.println(a);//返回3
			a = fis.read(bytes);
			System.out.println(a);//返回-1
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
