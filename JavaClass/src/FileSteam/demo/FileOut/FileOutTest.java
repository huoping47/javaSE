package FileSteam.demo.FileOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 */
public class FileOutTest {
	public static void main ( String[] args ) {
		FileOutputStream out =null;
		String files = "src/FileSteam/demo/FileOut/write";
		try {
			out = new FileOutputStream( files );
			String str = "咖啡，去拿一个玩具过来玩";
			byte[] bytes = str.getBytes();
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
