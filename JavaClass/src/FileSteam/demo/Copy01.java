package FileSteam.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 霍平  2022/5/30 0030
 * @email huoping_47@126.com
 * @title
 */
public class Copy01 {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		FileOutputStream out = null;
		try {
			fis = new FileInputStream( "src/FileSteam/demo/FileOut/write" );
			out = new FileOutputStream( "src/FileSteam/demo/write" );
			byte[] bytes = new byte[1024*1024];
			int count = 0;
			while((count  = fis.read(bytes)) !=-1){
				out.write( bytes,0,count );
			}
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
