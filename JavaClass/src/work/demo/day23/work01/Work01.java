package work.demo.day23.work01;
/*
第一题：
	编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。

		public class MyStack{ // 栈类

			// 提供一个数组来存储栈中的元素
			Object[] elements;

			// 栈帧（永远指向栈顶部的元素）
			// 每加1个元素，栈帧+1
			// 每减1个元素，栈帧-1
			int index;

			// 构造方法
			// 构造方法是不是应该给一维数组一个初始化容量。

			// push方法（push方法压栈）
			// 压栈表示栈中多一个元素。
			// 但是栈如果已满，压栈失败。
			// 这个方法的参数以及返回值类型自己定义。

			// pop方法（pop方法弹栈）
			// 弹栈表示栈中少一个元素。
			// 但是栈如果已空，弹栈失败。
			// 这个方法的参数以及返回值类型自己定义。

		}

		main(){
			测试...
		}
 */
public class Work01 {
    public static void main(String[] args) {
        Statck statck = new Statck(new Object[5]);
//        Statck statck = new Statck();
            statck.push(new Object[]{15,20,30,40});
            statck.pop(4);
            statck.numbers();
    }
}
//我的栈类
class Statck{
//    Object[] objects ={10,20,30,50,40};
    Object[] objects;
    public Statck(){
    }
    //有参构造方法获取数组
    public Statck(Object[] objects) {
        this.objects = objects;
    }

    int a ;
    int b ;
    //入栈方法
    public void push(Object[] objects){
        if (objects.length>this.objects.length){
            System.out.println("栈已经满了");
        }else{
            //判断栈的每一个元素是否为空
            for(int j = 0;j<objects.length;j++){
                if (this.objects[j] == null){
                    this.objects[j] = objects;
                    this.b = objects.length;
                    System.out.println(this.objects[j]+"\t入栈成功");
                }else{
                    System.out.println("您的数组空间已经存不下了");
                    return;
                }
            }
        }
    }
    //弹栈方法
    public void pop(int number){
        if (this.objects[0] == null) {
            System.out.println("栈已经是空的了");
            return;
        }
        if (number>b){
            System.out.println("请输入正确的弹栈数量");
            return;
        }
        int c = 0;
        for (int i = this.b-1; i >=0; i--) {//i,b=4,3
            this.objects[i] = null;
            c++;
            if (number==c){//number = 3; i=5
                return;
            }
            System.out.println("弹栈成功");
        }
    }
    public void numbers (){
        for (int i = 0; i < this.objects.length; i++) {
            System.out.println(this.objects[i]);
        }
    }
}