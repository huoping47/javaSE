package FileSteam.demo.objOut;

import java.io.Serializable;

/**
 * @author 霍平  2022/6/1 0001
 * @email huoping_47@126.com
 * @title
 */
public class Students implements Serializable {
	private int age;
	private  String name;
	private static final long serialVersionUID = 8683452581122892L;
	private int a;
	public Students () {
	}
	
	public Students ( int age, String name ) {
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
	
	@Override
	public String toString () {
		return "Students{" +
				"age=" + age +
				", name='" + name + '\'' +"傻逼哦"+
				'}';
	}
}
