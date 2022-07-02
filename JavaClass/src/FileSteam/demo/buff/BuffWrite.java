package FileSteam.demo.buff;

import java.io.*;

/**
 * @author 霍平  2022/5/31 0031
 * @email huoping_47@126.com
 * @title
 */
public class BuffWrite {
	public static void main ( String[] args ) throws Exception {
		BufferedWriter bf = new BufferedWriter(new FileWriter( "src/FileSteam/demo/Write1.txt",true ));
		bf.flush();
		bf.write( "你好啊，你吃饭了吗？我好饿啊");
		bf.close();
	}
}
