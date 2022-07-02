package FileSteam.demo.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 霍平  2022/5/31 0031
 * @email huoping_47@126.com
 * @title
 */
public class OutInput {
	public static void main ( String[] args ) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream( "src/FileSteam/demo/Write.txt" );
			String str = "你在干嘛啊？你吃饭了吗？要不要请我吃饭啊";
			byte[] bytes= str.getBytes();
			out.write( bytes );
			out.flush();
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			if ( out != null ) {
				try {
					out.close();
				} catch ( IOException e ) {
					e.printStackTrace();
				}
			}
		}
	}
}
