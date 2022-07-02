package work.demo.day32;

import java.io.*;
import java.util.*;

/**
 * @author 霍平  2022/6/2 0002
 * @email huoping_47@126.com
 * @title
 */
public class Students implements Serializable {
	public static final long SERIALIZABLE_ID = 123465474616L;
	private int id;
	private String name;
	private char sex;
	private int age;
	private String email;
	HashMap<Integer,String> map = new HashMap<>();//存储学生的ID和名字
	Set< Map.Entry<Integer,String>> set = map.entrySet();
	HashMap<Integer,Character> map1 = new HashMap<>();//根据ID存储学生的性别
	HashMap<String,String> map2 = new HashMap<>();//根据姓名存储学生的email
	HashMap<String,Integer> map3 = new HashMap<>();//根据姓名存储学生的年龄
	ObjectInputStream obj1 = null;//序列化
	ObjectOutputStream obj = null;//序列化
	List<Object> list = null;
	
	Scanner sca = new Scanner( System.in );
	static {
		
		System.out.println("系统打开时显示以下信息：\n" +
				"欢迎使用学生信息管理系统，请认真阅读以下使用说明：\n" +
				"请输入不同的功能编号来选择不同的功能：\n" +
				"[1]查看学生列表\n" +
				"[2]保存学生\n" +
				"[3]删除学生\n" +
				"[4]查看某个学生详细信息");
	}
	public Students () throws IOException, ClassNotFoundException {
//		map.put( 1001,"张三" );
//		map1.put( 1001,'男' );
//		map1.put( 1002,'女' );
//		map2.put( "王麻子","www.baidu.com" );
//		map2.put( "李四","www.jingdong.com" );
//		map3.put( "王麻子",21 );
//		map3.put( "李四",31 );
//		map.put( 1002,"李四" );
		System.out.print("请输入数字:");
		int num = sca.nextInt();
		switch ( num){
			case 1: slecete();break;
			case 2:crtyAll();break;
		}
	}
	
	//保存，新增学生
	private void crtyAll () throws IOException, ClassNotFoundException {
		System.out.println("请输入学生的学号");
		this.id= sca.nextInt();
		if ( map.containsKey( this.id )) {
			System.out.println("学生ID已经存在了，如果强行加入会覆盖之前的学生信息,是否强行加入该学生?请输入是或者取消");
			String str = sca.next();
			switch ( str ){
				case "是":
					System.out.println("那么请输入学生的姓名");
					this.name = sca.next();
					System.out.println("请输入学生的性别:男/女");
					this.sex = sca.next().charAt( 0 );
					System.out.println("请输入学生的年龄");
					this.age = sca.nextInt();
					if ( this.age <0 ||this.age>150 ) {
						System.out.println("请输入正确的年龄");
						break;
					}
					System.out.println("请输入学生的Emali");
					this.email = sca.next();
					if (! this.email.endsWith( ".com" ) || this.email.length()<8) {
						System.out.println("请输入正确的邮箱");
						break;
					}
					map.put( this.id,this.name );
					map1.put( this.id,this.sex );
					map2.put( this.name,this.email );
					map3.put( this.name,this.age );
//					list = new ArrayList<>();
//					list.add( map );
//					list.add( map1 );
//					list.add( map2 );
					System.out.println("新增学生成功");
					try {
						obj = new ObjectOutputStream( new FileOutputStream("src/work/demo/day32/Studes.txt",true) );
						obj.writeObject( map );
						obj.writeObject( map1 );
						obj.writeObject( map2 );
						obj.writeObject( map3 );
						obj.flush();
					} catch ( IOException e ) {
						e.printStackTrace();
					}finally {
						if ( obj != null ) {
							try {
								obj.close();
							} catch ( IOException e ) {
								e.printStackTrace();
							}
						}
					}
					break;
				case "取消":
					this.crtyAll();
				break;
			}
		}else{
			System.out.println("那么请输入学生的姓名");
			this.name = sca.next();
			System.out.println("请输入学生的性别:男/女");
			this.sex = sca.next().charAt( 0 );
			System.out.println("请输入学生的年龄");
			this.age = sca.nextInt();
			if ( this.age <0 ||this.age>150 ) {
				System.out.println("请输入正确的年龄");
			}
			System.out.println("请输入学生的Emali");
			this.email = sca.next();
			if (! this.email.endsWith( ".com" ) || this.email.length()<8) {
				System.out.println("请输入正确的邮箱");
			}
			map.put( this.id,this.name );
			map1.put( this.id,this.sex );
			map2.put( this.name,this.email );
			map3.put( this.name,this.age );
//			list = new ArrayList<>();
//			list.add( map );
//			list.add( map1 );
//			list.add( map2 );
//			list.add( map3 );
			try {
				obj = new ObjectOutputStream( new FileOutputStream("JavaClass/src/work/demo/day32/Studes.txt",true) );
				obj.writeObject( map );
				obj.writeObject( map1 );
				obj.writeObject( map2 );
				obj.writeObject( map3 );
				System.out.println("新增学生成功");
				obj.flush();
			} catch ( IOException e ) {
				e.printStackTrace();
			}finally {
				if ( obj != null ) {
					try {
						obj.close();
					} catch ( IOException e ) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
	//查询所有的学生类
	private void slecete () {
		try {
			obj1 = new ObjectInputStream(new FileInputStream( "JavaClass/src/work/demo/day32/Studes.txt"  ) );
			Properties p = new Properties();
			p.load(obj1);
			System.out.println(p.getProperty("id"));
//			if ( obj1.readObject()  ) {
//				System.out.println("您好，你还没有添加学生");
//				return;
//			}
			System.out.print("学生信息列表展示\n" +
					"学号\t\t\t姓名\t\t\t\t\t性别\n" +
					"------------------------------------\n" );
			Object o = obj1.readObject();
			Object o1 = obj1.readObject();
			Object o2 = obj1.readObject();
			Object o3 = obj1.readObject();
			System.out.println(o);
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);
			if ( o instanceof HashMap || o1 instanceof HashMap ||o2 instanceof HashMap ||o3 instanceof HashMap) {
				HashMap map = (HashMap)o;
				HashMap map1 = (HashMap)o1;
				HashMap map2 = (HashMap)o2;
				HashMap map3 = (HashMap)o3;
				Set<Map.Entry<Integer,String>> set = map.entrySet();
//				Set<Map.Entry<Integer,Character>> set1 = map1.entrySet();
//				Set<Map.Entry<String,String>> set2 = map2.entrySet();
				System.out.println(set.iterator());
				for ( Map.Entry<Integer,String> m:set ){
					this.id = m.getKey();
					this.name = m.getValue();
					 this.sex= ( char ) map1.get( this.id);
					 this.email = ( String ) map2.get( this.name );
					 this.age = ( int ) map3.get( this.name );
					System.out.print(this.id+"\t\t\t\t\t"+this.name+"\t\t\t\t\t"+this.sex+"\n");
				}
			}
			
		} catch ( IOException | ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}
	
	public Students ( int id, String name, int age, String email ) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	@Override
	public String toString () {
		return "Students{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex=" + sex +
				", age=" + age +
				", email='" + email + '\'' +
				'}';
	}
	
	public int getId () {
		return id;
	}
	
	public void setId ( int id ) {
		this.id = id;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName ( String name ) {
		this.name = name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge ( int age ) {
		this.age = age;
	}
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail ( String email ) {
		this.email = email;
	}
	
}
