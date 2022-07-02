package FileSteam.demo.FileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 */
public class FileInputTest02 {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "src/FileSteam/demo/FileInput/新建文本文档.txt" );
			int num = 0;
			byte[] bytes = new byte[4];
			StringBuilder str = new StringBuilder();
			while((num = fis.read(bytes)) !=-1){
				String str1 = new String(bytes,0,num);
				str.append( str1 );
				System.out.print(str1);
			}
//			System.out.println(str);
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
