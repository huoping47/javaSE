package FileSteam.demo.FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 */
public class FileInputTest04 {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "src/FileSteam/demo/FileInput/新建文本文档.txt" );
//			byte[] bytes = new byte[8];
			byte[] bytes = new byte[fis.available()];
			int count = 0;
			while((count = fis.read(bytes)) !=-1){
				String str = new String(bytes,0,count);
				System.out.print(str);
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
