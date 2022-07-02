package work.demo.day28;

/**
 * @author 霍平
 * @email huoping_47@126.com
 * @date 2022/5/28 002821:50
 * 节点类
 */
public class Node {
	Object date;//存储的数据
	Node next;//下一个节点的位置
	
	public Node ( Object date ) {
		this.date = date;
	}
	
	public Node ( Object date, Node next ) {
		this.date = date;
		this.next = next;
	}
}
