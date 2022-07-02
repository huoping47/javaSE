package work.demo.Test;

import java.util.Date;
import java.util.Locale;

/**
 * @author 霍平  2022/5/29 0029
 * @email huoping_47@126.com
 * @title   String常用的方法
 */
public class StringTest {
	public static void main ( String[] args ) {
		//char charAt​(int index) 返回指定索引处的 char值
		String c = "abcdefg";
		System.out.println(c.charAt( 3 ));//返回一个char值，d
		
//		int compareTo​(String anotherString) 按字典顺序比较两个字符串。
		String s = "d";
		String s1 = "c";
		System.out.println(s1.compareTo( s ));//字符串中的CompareTo只能比较字母
		
//		String concat​(String str)将指定的字符串连接到此字符串的末尾。
		String s2 = "你好啊";
		System.out.println(s2.concat( ":霍平" ));
		
//		boolean contains​(CharSequence s) 当且仅当此字符串包含指定的char值序列时，才返回true。
		String s3 = "https://www.baidu.com";
		System.out.println(s3.contains( "http://" ));
		
//		boolean endsWith​(String suffix) 测试此字符串是否以指定的后缀结尾。
		String s4 = "http://www.baidu.com";
		System.out.println(s4.endsWith( ".com" ));
//		boolean startsWith​(String prefix) 测试此字符串是否以指定的前缀开头。
		System.out.println(s4.startsWith( "www" ,7));
		
//		static String format​(String format, Object... args) 使用指定的格式字符串和参数返回格式化字符串。
		String s5 = "吃饭喇嘛";
		System.out.println( String.format( s5));
		
//		int indexOf​(int ch) 返回指定字符第一次出现的字符串中的索引。
		String s6 = "http://www.baidu.com";
		System.out.println(s6.indexOf( "m" ,8));//str参数是需要查找的参数，第二个参数是从哪个下标开始找
		System.out.println(s6.lastIndexOf( "w",7 ));//从最后一个找的话第二个参数是截止到某个下标，开始往前找
		System.out.println(s6.indexOf( 'p' ,10));//没有找到会返回-1
		
//		int length() 返回此字符串的长度
		String s7 ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(s7.length());
		
//		String repeat​(int count) 返回一个字符串，其值为此字符串的串联重复 count次。
		String s8 = "abc-";
		String s9= "你好啊,张三,张六,张伟";
		System.out.println(s8.repeat( 3 ));
		//replace是替换，repeat是重复
		System.out.println(s8.replace( "c","d" ));//把c替换成d
		System.out.println(s9.replace( "张","赵" ));
		System.out.println(s8.replace( 'c','w' ));
		System.out.println(s9.replace( ',','-' ));
		
//		String[] split​(String regex) 将此字符串拆分为给定 regular expression的匹配 项 。
		String s10 = "a,b,c,d,e,f";
		String[] strings = s10.split( ",",2 );//limit的参数意思是把这个字符串分成几部分
		for ( int i = 0; i < strings.length; i++ ) {
			System.out.print(strings[i]+"\t\t");
		}
		System.out.println();
//		String strip() 返回一个字符串，其值为此字符串，并删除了所有前导和尾随 white space 。
		String s11 = "   哈你    ";
		System.out.println(s11.strip());
	
//		String substring​(int beginIndex) 返回一个字符串，该字符串是此字符串的子字符串。
		String s12 = "你好啊，大声道啊";
		System.out.println(s12.substring( 3 ));//截取下标为4后面的所有值
//		String substring​(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。
		System.out.println(s12.substring( 0,2 ));//从某个下标开始，然后在某个下标结束
		
//		char[] toCharArray() 将此字符串转换为新的字符数组。
		String s13 = "我要吃饭了";
		char[] chars= s13.toCharArray();
		for ( int i = 0; i < chars.length; i++ ) {
			System.out.print(chars[i]+"\t");
		}
		System.out.println();
//		String toLowerCase() 使用默认语言环境的规则将此 String所有字符转换为小写。
		String s14 = "ABCDEFG";
		System.out.println(s14.toLowerCase( Locale.ROOT ));
		String s15 = "abcdefg";
		System.out.println(s15.toUpperCase( Locale.ROOT ));
		
//		static String valueOf​(int i) 返回 int参数的字符串表示形式。
		int a =15;
		System.out.println(String.valueOf( a )+5);
	
//	    static String valueOf​(char[] data) 返回 char数组参数的字符串表示形式。
		char[] chars1 = new char[]{'你','好','啊','吃','饭','了'};
		String s16 = String.valueOf( chars1 );
		System.out.println(s16);
		
		
		
	}
}
