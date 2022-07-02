package gather.demo.map;

import java.util.TreeSet;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002820:13
 */
public class TreeSet02 {
	//先按照年龄升序，如果年龄一样的就按照姓名升序
	public static void main ( String[] args ) {
		People people = new People(25,"张三");
		People people1 = new People(20,"李四");
		People people2 = new People(37,"王五");
		People people3 = new People(18,"刘六");
		People people4 = new People(28,"赵七");
		TreeSet<People> treeSet = new TreeSet<>();
		treeSet.add( people );
		treeSet.add( people1 );
		treeSet.add( people2 );
		treeSet.add( people3 );
		treeSet.add( people4 );
		for ( People p : treeSet ){
			System.out.println(p	);
		}
	}
}
class People implements  Comparable<People>{
	private int age;
	private String name;
	
	public People ( int age, String name ) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge ( int age ) {
		this.age = age;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName ( String name ) {
		this.name = name;
	}
	public String toString(){
		return "年龄:"+this.age+"----姓名:"+this.name;
	}
	
	@Override
	/*compareTo的返回值很重要：
		返回o表示相同，value会覆盖
		返回>0.会继续往右子树上找
		返回<0.会继续往左子树上找
	*/
	public int compareTo ( People o ) {
		if ( this.age-o.age ==0){
			return this.name.compareTo( o.name );
		}
		return this.age-o.age;
	}
}