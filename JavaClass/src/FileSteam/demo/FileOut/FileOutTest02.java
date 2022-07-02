package FileSteam.demo.FileOut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 */
public class FileOutTest02 {
	public static void main ( String[] args ) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream( "src/FileSteam/demo/FileOut/write1" ,true);
			byte[] dayes = new byte[]{97,98,99,100};
			String str= "我是中国人,15,16,17,18,19";
			byte[] bytes = str.getBytes();
			out.write( bytes );
			out.write( dayes );
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
