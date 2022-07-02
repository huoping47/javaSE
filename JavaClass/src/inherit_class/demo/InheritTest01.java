package inherit_class.demo;
/*
继承
 */
public class InheritTest01 {
	public static void main(String[] args) {
		//创建InheritClass02类，然后调用InheritClass02类当中继承了InheritClass01类当中的方法
		InheritClass001 ic = new InheritClass001();
		ic.setName("张三");
		ic.setAddr("长沙");
		ic.setId(15);
		System.out.println(ic.getAddr()+ic.getId()+ic.getName());
	}
}
