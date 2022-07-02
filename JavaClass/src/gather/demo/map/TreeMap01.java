package gather.demo.map;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002819:09
 *
 */
public class TreeMap01 {
	public static void main ( String[] args ) {
		Set<String> treeSet = new TreeSet<>();
		treeSet.add( "a" );
		treeSet.add( "c" );
		treeSet.add( "d" );
		treeSet.add( "z" );
		treeSet.add( "b" );
		treeSet.add( "y" );
		//TreeSet底层会自动排序，输出a,b,c,d,y,z
		for ( String s:treeSet ){
			System.out.println(s);
		}
		
		//TreeSet自动排序需要实现Comparable接口中的compareTo方法
		User user = new User(15);
		User user1 = new User(10);
		User user2 = new User(21);
		TreeSet<User> treeSet1 = new TreeSet<>();
		treeSet1.add( user );
		treeSet1.add( user1 );
		treeSet1.add( user2 );
		for ( User u: treeSet1 ){
			System.out.println(u);
		}
	}
}

class User implements Comparable{
	int age;
	
	public User ( int age ) {
		this.age = age;
	}
	
//	@Override  重写比较规则
	public int compareTo ( Object o ) {
		User user = (User)o;
		return this.age - user.age;
	}
	
	public String toString(){
		return "年龄【"+this.age+"】";
	}
}