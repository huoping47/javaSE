package work.demo.Test;

/**
 * @author 霍平  2022/5/29 0029
 * @email huoping_47@126.com
 * @title
 */
public class StringBufferTest {
	public static void main ( String[] args ) {
		StringBuffer stringBuffer = new StringBuffer();
//		StringBuffer append​(char c) 将 char参数的字符串表示形式追加到此序列。s
		stringBuffer.append( "你" );
		System.out.println(stringBuffer.append( "吃饭了吗" ));
//	StringBuffer append​(char[] str) 将 char数组参数的字符串表示形式追加到此序列。
		char[] chars = new char[]{'你','好','a'};
		System.out.println(stringBuffer.append( chars,2,1 ));//参数表示从哪里开始添加，添加几个元素
		
//		int capacity() 返回当前容量。
		System.out.println(stringBuffer.capacity());
	
//		char charAt​(int index) 返回指定索引处的此序列中的 char值。
		System.out.println(stringBuffer.charAt( 3 ));
	
//		int codePointAt​(int index) 返回指定索引处的字符（Unicode代码点）。
		System.out.println(stringBuffer.codePointAt( 5 ));
	
//	StringBuffer delete​(int start, int end) 删除此序列的子字符串中的字符。
//		System.out.println(stringBuffer.delete( 1,3 ));
	
//		StringBuffer deleteCharAt​(int index) 按此顺序删除指定位置的 char 。
		System.out.println(stringBuffer.deleteCharAt( 2 ));
		
//		StringBuffer insert​(int offset, char c) 将 char参数的字符串表示形式插入此序列中。
		System.out.println(stringBuffer.insert( 2,"饭" ));
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
