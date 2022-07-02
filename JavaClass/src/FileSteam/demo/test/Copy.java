package FileSteam.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 霍平  2022/5/31 0031
 * @email huoping_47@126.com
 * @title
 */
public class Copy {
	public static void main ( String[] args ) {
		FileInputStream fis = null;
		FileOutputStream out = null;
		try {
			fis = new FileInputStream( "D:\\java\\jdk11\\JDK 11 中文帮助文档.zip" );
			out = new FileOutputStream( "D:\\java\\jdk11\\JDK 11 中文帮助文档\\JDK.zip" );
			byte[] bytes = new byte[1024*1024];
			int count = 0;
			while ( (count = fis.read(bytes))!=-1 ){
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
