package FileSteam.demo.FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 */
public class FileInputTest03 {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "src/FileSteam/demo/FileInput/新建文本文档.txt" );
			int count = 0;
			byte[] bytes = new byte[fis.available()];
			while ( (count = fis.read(bytes)) !=-1 ){
				System.out.print(new String(bytes));
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
