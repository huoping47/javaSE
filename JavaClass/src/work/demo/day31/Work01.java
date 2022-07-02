package work.demo.day31;

import java.io.*;
import java.util.Arrays;

/**
 * @author 霍平  2022/6/1 0001
 * @email huoping_47@126.com
 * @title   目录拷贝
 */
public class Work01 {
	public static void main ( String[] args ) {
		File file = new File( "D:\\java\\jdk8" );
		File file1 = new File( "C:\\" );
		copy(file,file1);

	}
	
	private static void copy ( File file,File files)  {
		File[] files1 = file.listFiles();
		if (  file.isFile() ) {
			FileInputStream fis =null;
			FileOutputStream out = null;
			try {
				fis = new FileInputStream( file );
				String str = files.getAbsolutePath().endsWith( "\\" ) ?  files.getAbsolutePath() +file.getAbsolutePath().substring( 3 ): files.getAbsolutePath()+"\\"+file.getAbsolutePath().substring( 3 );
				out = new FileOutputStream( str );
				byte[] bytes = new byte[1024*1024];
				int count = 0;
				while((count = fis.read(bytes)) !=-1){
					out.write( bytes,0,count );
				}
				
				out.flush();
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
				if ( out != null ) {
					try {
						out.close();
					} catch ( IOException e ) {
						e.printStackTrace();
					}
				}
			}
			return;
		}
		for ( File f:files1 ){
			if ( f.isDirectory() ) {
				String str = f.getAbsolutePath();
				String str1 = str.endsWith( "\\" ) ?  files.getAbsolutePath() +str.substring( 3 ): files.getAbsolutePath()+"\\"+str.substring( 3 );
				File file1 = new File( str1 );
				if ( ! file1.exists() ) {
					file1.mkdirs();
				}
			}
			copy( f,files);
		}
	}
}
