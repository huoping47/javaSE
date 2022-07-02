package work.demo.day28;

import java.util.LinkedList;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002821:50
 * 编写程序实现单向链表数据结构：
 * 	public class Node {
 * 		Object data;
 * 		Node next;
 *        }
 * 	public class MyLinkedList{
 * 		Node header;
 * 		....
 * 		// 添加数据的方法
 * 		// 删除数据的方法
 * 		// 修改数据的方法
 * 		// 查找数据的方法
 * 		// 打印集合中每个元素的方法
 *    }
 *
 * 	最后编写测试程序
 */
public class Work01 {
	public static void main ( String[] args ) {
		User user = new User( "张三" );
		MyLinkedList list = new MyLinkedList();
		list.add( user );
	}
}
class User{
	String name;
	
	public User ( String name ) {
		this.name = name;
	}
}
