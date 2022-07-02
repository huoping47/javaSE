package FileSteam.demo.buff;

import java.io.*;

/**
 * @author 霍平  2022/5/31 0031
 * @email huoping_47@126.com
 * @title
 */
public class BuffReader {
	public static void main ( String[] args ) throws Exception{
		//BufferedReader缓冲流，可以不需要char数组和byte数组，readLine方法可以读取一行
		//InputStreamReader转换流，把字节流转换成字符流
		BufferedReader bf = new BufferedReader( new InputStreamReader( new FileInputStream( "src/FileSteam/demo/Write.txt" ) ) );
		System.out.println(bf.readLine());
		bf.close();
	}
}
